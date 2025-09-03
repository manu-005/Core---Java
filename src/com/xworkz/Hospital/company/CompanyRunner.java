package com.xworkz.Hospital.company;

public class CompanyRunner {
    public static void main(String[] args) {

        Project project1 = new Project();
        project1.setId(101);
        project1.setName("E-commerce");
        project1.setCatagory("Web Application");
        project1.setDate("09/12/2022");
        project1.setDomain("Java Domain");

        Project project2 = new Project();

        project2.setId(102);
        project2.setName("Social Media");
        project2.setCatagory("Mobile Application");
        project2.setDate("09/02/2020");
        project2.setDomain("Python Domain");

        Company company = new Company();

        company.addProject(project1);
        company.addProject(project2);


        company.getDetails();


    }
}
