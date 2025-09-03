package com.xworkz.Hospital.company;

public class Company {

    Project[] projects = new Project[2];
    int index;

    public void addProject(Project project) {

        if (project != null) {
            {
                projects[index++] = project;
            }
        }
    }

    public void getDetails() {
        System.out.println("Details :");
        for (Project p : projects) {
            System.out.println("id =" + p.getId());
            System.out.println("Name =" + p.getName());
            System.out.println("Domain =" + p.getDomain());
            System.out.println("Catagory =" + p.getCatagory());
            System.out.println("Date =" + p.getDate());
            System.out.println("---------------------------------------");

        }
    }
}
