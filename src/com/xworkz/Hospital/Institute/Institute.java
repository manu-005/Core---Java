package com.xworkz.Hospital.Institute;

public class Institute {

    int index;
    Trainee[] trainees = new Trainee[2];

    public void addTrainee(Trainee trainee) {

        if (trainee != null) {trainees[index++] = trainee;}
        else System.out.println("Invalid Trainee");

    }

    public void getTraineDetails() {
        System.out.println("Trainee Details");
        for (Trainee t : trainees) {
            System.out.println("Id =" + t.getId());
            System.out.println("Name =" + t.getName());
            System.out.println("Catagory =" + t.getCatagory());
            System.out.println("date =" + t.getDate());
            System.out.println("Domain =" + t.getDomain());
            System.out.println("----------------------------");
        }
    }
}
