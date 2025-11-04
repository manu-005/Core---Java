package com.crudoperations.hospital.hospitalRules;

import com.crudoperations.hospital.patient.PatientDetails;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
public class HospitalRulesImpl implements HospitalRulesInterface{

   public  List<PatientDetails> patients = new ArrayList<>();

    @Override
    public void addPatient(PatientDetails patient) {
        boolean isAdded= false;

            if(patient != null){
                patients.add(patient);
                isAdded=true;
                System.out.println("added");
            }

    }

    @Override
    public void getAllPatients() {

        for (PatientDetails p : patients){

            System.out.println(patients);

            //another way to get all patients
//            if (p != null){
//                System.out.println("id :"+p.getId());
//                System.out.println("name :"+p.getName());
//                System.out.println("age :"+p.getAge());
//                System.out.println("___________________");
//            }
//            else {
//                System.out.println("patients not found..");
//            }

        }

    }
}
