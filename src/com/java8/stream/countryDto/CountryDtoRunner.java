package com.java8.stream.countryDto;

import com.java8.stream.CountryRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryDtoRunner {

    public static void main(String[] args) {

        List<CountryDto> list = new ArrayList<>();

        list.add(new CountryDto(102,"india", 1467934703 ,"Namo Modi",3.287,28,"Asia",true,"kannada"));
        list.add(new CountryDto(103, "america", 343603404, "Joe Biden", 9.834, 50, "North America", true, "English"));
        list.add(new CountryDto(100, "china", 1415057435, "Xi Jinping", 9.6, 23, "Asia", false, "Standard Chinese"));
        list.add(new CountryDto(109, "brazil", 213073451, "Luiz Inácio Lula da Silva", 8.516 , 26, "South America", false, "Portuguese"));
        list.add(new CountryDto(106, "russia", 143730481, "Vladimir Putin", 17.1, 89, "Eurasia", false, "Russian"));
        list.add(new CountryDto(101, "germany", 849865543, "Olaf Scholz", 357.588, 16, "Europe", true, "German"));
        list.add(new CountryDto(104, "japan", 1229674362, "Fumio Kishida", 377.975 , 47, "Asia", true, "Japanese"));
        list.add(new CountryDto(105, "nigeria", 224354873, "Bola Ahmed Tinubu", 923.768, 36, "Africa", false, "English"));
        list.add(new CountryDto(106, "mexico", 1297653589, "Andrés Manuel López Obrador", 1.964, 32, "North America", false, "Spanish"));
        list.add(new CountryDto(110, "australia", 7055254, "Anthony Albanese", 7.692 , 6, "Oceania", true, "English"));

        System.out.println("continent equal to asia :");
        list.stream().filter(eachCountryDto -> eachCountryDto.getContinent().equalsIgnoreCase("asia")).forEach(System.out::println);
        System.out.println("---------------------------");

        System.out.println("Country name starts with I :");
        list.stream().filter(eachCountryDto -> eachCountryDto.getCountryName().startsWith("i")).forEach(System.out::println);
        System.out.println("---------------------------");

        System.out.println("high papulation :");
//        list.stream().max((o1, o2) -> o1.getPopulation() - o2.getPopulation()).for
        System.out.println("---------------------------");

        System.out.println("papulation : " + list.stream().max((o1, o2) -> o1.getPopulation() - o2.getPopulation()).get());

        System.out.println("---small----find first" +

       list.stream().sorted(Comparator.comparing(CountryDto::getPopulation)).findFirst()  );
        System.out.println("group by :"+
       list.stream().collect(Collectors.groupingBy(CountryDto::getContinent, Collectors.counting())));

        System.out.println("--map--"+ list.stream().map(CountryDto::getContinent).distinct().collect(Collectors.toList()));


    }
}
