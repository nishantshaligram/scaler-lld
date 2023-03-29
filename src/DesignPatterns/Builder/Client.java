package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setBatchname("LLD")
                .setName("Thrun")
                .setGradyear(2022)
                .setPsp(90)
                .setYoe(1)
                .build();

        System.out.println(s);
    }
}
