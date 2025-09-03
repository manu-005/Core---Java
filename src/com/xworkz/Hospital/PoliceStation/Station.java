package com.xworkz.Hospital.PoliceStation;

public class Station {

    int index;
    Police[] policers = new Police[2];

    public void addpolice(Police police) {
        boolean added = false;
        if (police != null)

            {
                policers[index++] = police;
                added = true;
            }
        else {
            System.out.println("Invalid Project");
        }
    }

    public void getDetails() {
        System.out.println("Details :");

        for (Police p : policers) {
            System.out.println("Id =" + p.getId());
            System.out.println("Joining date =" + p.getJoiningdate());
            System.out.println("Name =" + p.getName());
            System.out.println("post =" + p.getPost());
            System.out.println("Age =" + p.getAge());
            System.out.println("-------------------------------------");

        }
    }


}
