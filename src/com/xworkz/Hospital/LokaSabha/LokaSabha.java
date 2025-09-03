package com.xworkz.Hospital.LokaSabha;

public class LokaSabha {

    int index;
    Politician[] polititians = new Politician[2];
    public void addPolitician(Politician politician){

        if (politician !=null ){
            polititians[index++] = politician;
        }else System.out.println("Invalid Politician");
    }

    public void getPoliticianDetails(){
        System.out.println("Details of Politicians");
        for (Politician p : polititians){
            System.out.println("Id = "+p.getId());
            System.out.println("name = "+p.getName());
            System.out.println("Distict = "+p.getDistict());
            System.out.println("Gender = "+p.getGender());
            System.out.println("Party = "+p.getParty());
            System.out.println("------------------");
        }
    }












}
