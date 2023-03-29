package DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprilBatch = new Student();
        aprilBatch.setBatchName("April 2022");
        aprilBatch.setAvgBatchPsp(90);
        aprilBatch.setInstructorName("Sandeep");
        aprilBatch.setYearOfEnrollment(2022);

        Student mayBatch = new Student();
        mayBatch.setBatchName("May 2022");
        mayBatch.setAvgBatchPsp(90);
        mayBatch.setInstructorName("Naman");
        mayBatch.setYearOfEnrollment(2022);

        Student juneBatch = new Student();
        juneBatch.setBatchName("June 2022");
        juneBatch.setAvgBatchPsp(92);
        juneBatch.setInstructorName("Tarun");
        juneBatch.setYearOfEnrollment(2022);

        studentRegistry.save(aprilBatch);
        studentRegistry.save(mayBatch);
        studentRegistry.save(juneBatch);


        // student of april batch
        Student aprilBatchPrototype = studentRegistry.get("April 2022");
        Student raj = aprilBatchPrototype.clone();
        raj.setId(1);
        raj.setName("Raj");
        raj.setAge(26);

        // student of may batch
        Student mayBatchPrototype = studentRegistry.get("May 2022");
        Student naveen = mayBatchPrototype.clone();
        naveen.setId(1);
        naveen.setName("Naveen");
        naveen.setAge(26);

        IntelligentStudent superBatch = new IntelligentStudent();
        superBatch.setBatchName("Super Batch");
        superBatch.setAvgBatchPsp(100);
        superBatch.setInstructorName("XYZ");
        superBatch.setYearOfEnrollment(2023);

        IntelligentStudent superA = superBatch.clone();
        superA.setId(2);
        superA.setName("A");
        superA.setAge(12);
        superA.setId(100);
    }
}
/*
*   Create Prototype objects
*   Store them in registry(map)
*   get prototype from registry(map)
*   create a clone (deep copy) of prototype
*   update the values and use it
* */