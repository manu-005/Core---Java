package com.crudoperations.hospital;

import com.crudoperations.hospital.hospitalRules.HospitalRulesImpl;
import com.crudoperations.hospital.hospitalRules.HospitalRulesInterface;
import com.crudoperations.hospital.patient.PatientDetails;

import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {

        HospitalRulesInterface hospitalRulesInterface = new HospitalRulesImpl();

        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setId(123);
        patientDetails.setName(null);
        patientDetails.setAge(44);

        PatientDetails patientDetails2 = new PatientDetails();
        patientDetails2.setId(323);
        patientDetails2.setName("darshan");
        patientDetails2.setAge(22);

        hospitalRulesInterface.addPatient(patientDetails);
        hospitalRulesInterface.addPatient(patientDetails2);

        hospitalRulesInterface.getAllPatients();

    }
}
