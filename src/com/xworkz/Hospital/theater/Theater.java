package com.xworkz.Hospital.theater;

public class Theater {
    int index;
    Movie[] moveis = new Movie[2];

    public void addMovie(Movie movie) {

        if (movie != null) {

            moveis[index++] = movie;
        } else {
            System.out.println("Invalid movie");
        }
    }

    public void getMovieDetails() {

        System.out.println("Movies Details ");

        for (Movie m : moveis) {
            System.out.println("Id =" + m.getId());
            System.out.println("Name =" + m.getName());
            System.out.println("CAtagory =" + m.getCatagory());
            System.out.println("Date =" + m.getDate());
            System.out.println("Block =" + m.getBlock());
            System.out.println("-----------------------------");
        }

    }
}
