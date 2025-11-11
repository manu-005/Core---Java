package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryRunner {
    public static void main(String[] args) {

        List<String> country = new ArrayList<>();

        country.add("India");
        country.add("Indonesia");
        country.add("rusai");
        country.add("America");
        country.add("Japan");
        country.add("china");
        country.add("egypt");
        country.add("iran");
        country.add("turkey");
        country.add("sri lanka");

        // step - 1 : hard code for practice
        //convert string to stream using stream() method which is type of Stream
        Stream<String> countryStream = country.stream();

        //step-3 : method declare for our requirement
        Predicate<String> predicate = c -> {
            return c.startsWith("i");
        };

        // step3 : after convertion to stream, we need to filter out the data or operation ,
        // filter method need predicate type argument so using lambda expression we write one method ,
        // which is return boolean, stored in predicate reference

        Stream<String> anything = countryStream.filter(predicate);

        // step 4 : this is main important becouse if we print  "anything"
        // we got stream.pipeline error so we need to call collect() method,
        //which is return list so we store this in list reference and then we got our data or output
        List<String> any = anything.collect(Collectors.toList());
        System.out.println(any);
        System.out.println("---------------------");
        //another way or better way for above is concise by java 8 in one line
        // convert to stream  => filter => collect
        System.out.println("starts with i:");
        List<String> anyone = country.stream().filter(c -> c.startsWith("i")).collect(Collectors.toList());
        System.out.println(anyone);
        System.out.println("---------------------");

        System.out.println("starts with i :");
        country.stream().filter(c -> c.startsWith("i")).forEach(System.out::println);
        System.out.println("---------------------");

        //---------------------------------------------------------------------
        System.out.println("starts with I :");
        country.stream().filter(countries -> countries.startsWith("I")).forEach(System.out::println);
        System.out.println("---------------------");

        //if we use for each, no need to store or declare a new list
        System.out.println("ends with a :");
        List<String> endsWithA = country.stream().filter(countries -> countries.endsWith("a")).collect(Collectors.toList());
        System.out.println(endsWithA);
        System.out.println("---------------------");


        //this is using foreach loop for printing
        System.out.println("length equal to 5 :");
        country.stream().filter(countries -> countries.length() == 5).forEach(System.out::println);
        System.out.println("---------------------");

        System.out.println("length greater than 5: ");
        List<String> greaterthan5 = country.stream().filter(greaterThan5 -> greaterThan5.length() > 5).collect(Collectors.toList());
        System.out.println( greaterthan5);
        System.out.println("---------------------");

        System.out.println("start with I and R :");
        country.stream().filter(startswithIR -> (startswithIR.startsWith("i") || startswithIR.startsWith("r"))).forEach(System.out::println);
        System.out.println("---------------------");

        System.out.println("ends with a and t :");
        List<String> endsAT = country.stream().filter(endswithAT -> endswithAT.endsWith("a") || endswithAT.endsWith("t")).collect(Collectors.toList());
        System.out.println(endsAT);
        System.out.println("---------------------");







    }
}
