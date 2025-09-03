package com.xworkz.Hospital.theater;

public class TheaterRunner {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setId(11);
        movie1.setName("KGF");
        movie1.setBlock("2");
        movie1.setDate("01/07/2003");
        movie1.setCatagory("Drama");

        Movie movie2 = new Movie();
        movie2.setId(12);
        movie2.setName("KGF2");
        movie2.setBlock("3");
        movie2.setDate("07/01/2004");
        movie2.setCatagory("Love");

        Theater t = new Theater();

        t.addMovie(movie1);
        t.addMovie(movie2);

        t.getMovieDetails();
    }
}
