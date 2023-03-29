package DesignPatterns.Builder;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradyear;
    private double psp;
    private String batchname;

    public Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradyear = builder.gradyear;
        this.psp = builder.psp;
        this.batchname = builder.batchname;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradyear=" + gradyear +
                ", psp=" + psp +
                ", batchname='" + batchname + '\'' +
                '}';
    }

    static class Builder {
        private int id;
        private String name; // name should be null
        private int yoe; // yoe should be >= 1
        private int gradyear; // gradyear should be <2023
        private double psp;
        private String batchname;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchname(String batchname) {
            this.batchname = batchname;
            return this;
        }

        public void validate(){
            if(name == null){
                throw new InvalidNameException("Name is invalid");
            }
            if(yoe < 1){
                throw new InvalidYoeException("years of experience should be at least 1");
            }
            if(gradyear >= 2023){
                throw new InvalidGradYearException("Grad Year should be 2022 or earlier");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }

}
