package com.xworkz.Hospital.Hospital;

import com.xworkz.Hospital.Hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {

    Patient patient = new Patient();
    patient.setPId(1);
    patient.setName("Preetham");
    patient.setAge(33);

    Patient patient1 = new Patient();
    patient1.setPId(2);
    patient1.setName("Bharath");
    patient1.setAge(22);

    Patient patient2 = new Patient();
    patient2.setPId(3);
    patient2.setName("Manthu");
    patient2.setAge(11);

    Hospital hospital = new Hospital();

    hospital.addPatient(null);
    hospital.addPatient(patient1);
    hospital.addPatient(patient2);

    hospital.getPatients();

    hospital.updateAge(1,99);
        hospital.getPatients();

        System.out.println("Name is:"+   hospital.getNameById(1));;



    }
}
