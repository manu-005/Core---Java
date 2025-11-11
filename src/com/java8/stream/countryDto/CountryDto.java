package com.java8.stream.countryDto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto {

    private int countryId;
    private String countryName;
    private int population;
    private String primeMinister;
    private double area;
    private int noOfStates;
    private String continent;
    private boolean isDemocretic;
    private String language;

}
