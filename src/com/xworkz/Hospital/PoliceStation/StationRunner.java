package com.xworkz.Hospital.PoliceStation;

public class StationRunner {
    public static void main(String[] args) {

        Police police1 = new Police();
        police1.setId(101);
        police1.setAge(33);
        police1.setJoiningdate("09/01/2026");
        police1.setName("Preetham");
        police1.setPost("PSI");
        police1.setStationName("UpparPete");

        Police police2 = new Police();
        police2.setId(102);
        police2.setAge(34);
        police2.setJoiningdate("22/02/2033");
        police2.setName("Dharshan");
        police2.setPost("SI");
        police2.setStationName("Shivanand Circle");

        Station station = new Station();

        station.addpolice(police1);
        station.addpolice(police2);

        station.getDetails();


    }
}
