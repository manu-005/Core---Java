package com.xworkz.Hospital.LokaSabha;

public class LoksabhaRunner {

    public static void main(String[] args) {

        Politician politician1 = new Politician();
        politician1.setId(101);
        politician1.setName("Arjun");
        politician1.setDistict("Bengalore");
        politician1.setParty("BJP");
        politician1.setGender("Male");

        Politician politician2 = new Politician();
        politician2.setId(102);
        politician2.setName("Hanum");
        politician2.setDistict("Karwar");
        politician2.setParty("Congress");
        politician2.setGender("Male");

        LokaSabha lokaSabha = new LokaSabha();
        lokaSabha.addPolitician(politician1);
        lokaSabha.addPolitician(politician2);

        lokaSabha.getPoliticianDetails();
    }
}
