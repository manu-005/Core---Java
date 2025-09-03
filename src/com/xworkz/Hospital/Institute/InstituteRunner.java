package com.xworkz.Hospital.Institute;

public class InstituteRunner {
    public static void main(String[] args) {

        Trainee trainee1 = new Trainee();

        trainee1.setId(1001);
        trainee1.setName("Manoj");
        trainee1.setCatagory("Regular");
        trainee1.setDate("09/12/2022");
        trainee1.setDomain("Java");

        Trainee trainee2 = new Trainee();

        trainee2.setId(1002);
        trainee2.setName("Preetham");
        trainee2.setDomain("Python");
        trainee2.setCatagory("External");
        trainee2.setDate("12/22/2020");

        Institute institute = new Institute();
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);

        institute.getTraineDetails();
    }
}
