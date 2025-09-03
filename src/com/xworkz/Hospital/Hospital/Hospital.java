package com.xworkz.Hospital.Hospital;

public class Hospital {

    int index;
    Patient[] patients = new Patient[3];


    public boolean addPatient(Patient patient) {
        boolean isAdded = false;

        if (patient != null) {

            patients[index++] = patient;
            isAdded = true;

        }else{
            System.out.println("Invalid Patient");
        }
        return isAdded;
    }

    public void getPatients() {

        System.out.println("Patients are : ");

        for (Patient var : this.patients) {
            System.out.println("iD:" + var.getPId());
            System.out.println("Name:" + var.getName());
            System.out.println("Age:" + var.getAge());

            System.out.println("-----------------");
        }
    }

    public void updateAge(int id, int age) {
        boolean updated = false;

        for (Patient var : patients) {

            if (var.getPId() == id) {

                var.setAge(45);
                updated = true;
            }
        }

        if (updated) {

            System.out.println("Updated");
        }
    }

    public String getNameById(int id) {
        String name = null;

        for (Patient nm : this.patients) {
            if (nm.getPId() == id) {

                name = nm.getName();
            }

        }
        System.out.println("get name is:");
        return name;
    }
}
