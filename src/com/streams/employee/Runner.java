package com.streams.employee;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        List<EmployeeDto> emp = new ArrayList<>();

        emp.add(new EmployeeDto(102, "Vinayaka", "Vinnu", "2021", 45000, "AI", 23, "male", "bangalore"));
        emp.add(new EmployeeDto(104, "Darshan", "Durga", "2020", 55000, "hiring", 29, "male", "haveri"));
        emp.add(new EmployeeDto(108, "Manu", "Manoj", "2015", 60000, "tester", 23, "male", "davanager"));
        emp.add(new EmployeeDto(101, "Priya", "k", "2025", 40000, "hr", 20, "female", "mysore"));
        emp.add(new EmployeeDto(109, "Chitz", "P", "2019", 65000, "support", 21, "female", "manddya"));
        emp.add(new EmployeeDto(103, "Preetham", "C", "2005", 77000, "hr", 24, "male", "hubli"));
        emp.add(new EmployeeDto(111, "Manu", "k", "2009", 145000, "AI", 43, "male", "bangalore"));
        emp.add(new EmployeeDto(113, "Shivraj", "S", "2013", 255000, "hr", 39, "male", "haveri"));
        emp.add(new EmployeeDto(119, "Manthu", "R", "2025", 640000, "AI", 53, "male", "davanagere"));
        emp.add(new EmployeeDto(120, "Manohar", "M", "2025", 420000, "AI", 43, "male", "mysore"));
        emp.add(new EmployeeDto(129, "Tan", "B", "1998", 650000, "support", 33, "female", "haveri"));
        emp.add(new EmployeeDto(123, "Bharath", "T", "1998", 774000, "AI", 30, "male", "dwd"));

        System.out.println("Sorted by Employee Id :");
        emp.stream().sorted((o1, o2) -> o1.getEmployeeId() - o2.getEmployeeId()).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee first Name :");
        emp.stream().sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee last name :");
        emp.stream().sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee Salary :");
        emp.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee Department :");
        emp.stream().sorted((o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment())).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee age :");
        emp.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee Gender :");
        emp.stream().sorted((o1, o2) -> o1.getGender().compareTo(o2.getGender())).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("Sorted by Employee Address :");
        emp.stream().sorted((o1, o2) -> o1.getAddress().compareTo(o2.getAddress())).forEach(System.out::println);
        System.out.println("---------------------------------------");


        System.out.println("distinct dept  :");
        emp.stream().map(EmployeeDto::getDepartment).distinct().forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("employee date of joining  :");
        emp.stream().sorted((o1, o2) -> o1.getDateOfJoining().compareTo(o2.getDateOfJoining())).forEach(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("1st heighest  salary :" +
                emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(0).findFirst());
        System.out.println("---------------------------------------");

        System.out.println("2 nd heighest salary :" +
                emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst());
        System.out.println("---------------------------------------");

        System.out.println("3 rd heighest salary :" +
                emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(2).findFirst());
        System.out.println("---------------------------------------");

        System.out.println("Number of male and female:" +
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));
        System.out.println("--------------------------------------------");

        System.out.println("Sorted by Employee Salaryand  date of joining  :");
        emp.stream().sorted((o1, o2) -> (o1.getSalary() - o2.getSalary()) - (o1.getDateOfJoining().compareTo(o2.getDateOfJoining())));
        System.out.println("---------------------------------------");

        System.out.println(" max age :" +
                emp.stream().max((o1, o2) -> o1.getAge() - o2.getAge()).get());
        System.out.println("---------------------------------------");

        System.out.println(" min age :" +
                emp.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get());
        System.out.println("---------------------------------------");
        System.out.println("MAnu equals");
       List<EmployeeDto> e =  emp.stream().filter(emp1 -> emp1.getFirstName().equalsIgnoreCase("manu")).collect(Collectors.toList());
        System.out.println(e);


        System.out.println("Name occurances  and its count :");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getFirstName, Collectors.counting())));
        System.out.println("-------------------------------------");


        System.out.println("Name occurances  and its count :");
//        System.out.println(
//                emp.stream().collect(Collectors.groupingBy(e-> e.getFirstName())));
        System.out.println("-------------------------------------");


        System.out.println("heighest salary from each dept :");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment ,Collectors.groupingBy(EmployeeDto::getGender,Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary))))));
        System.out.println("-------------------------------------");

        System.out.println("top 2 heighest salary  in each dept ");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment ,Collectors.minBy(Comparator.comparing(EmployeeDto::getSalary)))));
        System.out.println("-------------------------------------");

        System.out.println("1. groupping by employee city :");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getAddress,Collectors.counting())));
        System.out.println("-------------------------------------");

        System.out.println("2.groupping by Employee age :");
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getAge, Collectors.counting())));

//        emp.stream().collect(Collectors.groupingBy())
        System.out.println("-------------------------");

        System.out.println("3. Find the count of male and female employees present in the organization.");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender,Collectors.counting())));
        System.out.println("----------------------------------------------");

        System.out.println("4. Find the count of male and female present in each department.\n" );
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment ,Collectors.groupingBy(EmployeeDto::getGender,Collectors.counting()))));
        System.out.println("-------------------------------------");


        System.out.println("5. Print the names of all distinct departments in the organization.:" );
        System.out.println(
        emp.stream().map(EmployeeDto::getDepartment).distinct().collect(Collectors.toList()));
        System.out.println("-----------------------------");

        System.out.println("6. Print employee details whose age is greater than 28 in the organisation. :");
//        System.out.println(
        emp.stream().filter(ageGreater-> ageGreater.getAge() > 28).forEach(System.out::println);
        System.out.println("-----------------------");

        System.out.println(" 7. Find maximum age/oldest of employee in the organisation. :");
        System.out.println(
        emp.stream().max(Comparator.comparing(EmployeeDto::getAge)));
        System.out.println("----------------");

        System.out.println(" 8. Print Average age of Male and Female Employees in the organisation.");
        System.out.println(
        emp.stream().mapToInt(EmployeeDto::getAge).average());

        System.out.println("2 way :"+
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender,Collectors.averagingInt(EmployeeDto::getAge))));
        System.out.println("----------------");

        System.out.println("9. Print Average age of Male and Female Employees in each department");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.averagingInt(EmployeeDto::getAge))));

        System.out.println("2 way :"+
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.groupingBy(EmployeeDto::getGender,Collectors.averagingInt(EmployeeDto::getAge)))));

        System.out.println("----------------");

        System.out.println("10. Print the number of employees in each department.");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.counting())));
        System.out.println("----------------");

        System.out.println("11. Longest serving employee in organization:");
        //another way

        emp.stream().sorted((o1, o2) -> o1.getDateOfJoining().compareTo(o2.getDateOfJoining())).limit(1).forEach(System.out::println);

//        List i = emp.stream().map(EmployeeDto::getDateOfJoining).collect(Collectors.toList());
//        System.out.println("stream : "+i);

        System.out.println(
        emp.stream().min(Comparator.comparing(EmployeeDto::getDateOfJoining)));
        System.out.println("---------------------");

        System.out.println("12. Short serving employee in organization : ");
        System.out.println( emp.stream().max(Comparator.comparing(EmployeeDto::getDateOfJoining)));
        System.out.println("------------------------------------");

        System.out.println(" 13. Find average age of gender in each department.");
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.groupingBy(EmployeeDto::getGender,Collectors.averagingInt(EmployeeDto::getAge)))));
        System.out.println("--------------");

        System.out.println("14. Find youngest female employee in the organisation.");
        System.out.println(
        emp.stream().filter(youngFemale -> youngFemale.getGender().equalsIgnoreCase("female") ).collect(Collectors.minBy(Comparator.comparing(EmployeeDto::getAge))));
        System.out.println("--------------");

        System.out.println(" top 2 salary employee in each dept :");

        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment)).
                forEach((department , emp1) -> emp1.stream().
                        sorted(Comparator.comparing(EmployeeDto::getSalary)).limit(2).forEach(em -> System.out.println(em.getDepartment() + " "+ em.getFirstName()+" "+ em.getSalary()) ));
        System.out.println("-------------------");



        System.out.println("15. Find the youngest employee in each department.");

            emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment)).
                    forEach((department,emp2)-> emp2.stream().sorted(Comparator.comparing(EmployeeDto::getAge)).limit(1).forEach(e1 -> System.out.println(e1.getDepartment() + " " + e1.getFirstName() + " "+ e1.getAge())));
        System.out.println("------------------");

        System.out.println("16. Find employees whose age is greater than 30 and less than 30.\n");
        emp.stream().filter(a-> a.getAge() != 30).forEach(System.out::println);
        System.out.println("---------------------------------");

        System.out.println("17 .  find name of dept which is having highest employee :");
        System.out.println(emp.stream().
                collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())).
                entrySet().stream().
                max(Map.Entry.comparingByValue()).get().getKey());
        System.out.println("------------------");

        System.out.println("18. Find if there any employees from HR Department.\n");
        emp.stream().filter(hr -> hr.getDepartment().equalsIgnoreCase("hr")).forEach(System.out::println);
        System.out.println("------------------");

        System.out.println("19. Find the department names that these employees work for, where the number of employees in the department is over 3.\n");
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.counting())).
            entrySet().stream().filter(entry -> entry.getValue() >= 3 ).map(Map.Entry::getKey).collect(Collectors.toList()));
        System.out.println("--------------------------------");

        System.out.println("20. Find all employees who lives in ?Blore? city, sort them by their name and print the names of employees.\n");
emp.stream().sorted(Comparator.comparing(EmployeeDto::getFirstName)).filter(add -> add.getAddress().equalsIgnoreCase("bangalore")).forEach(nm ->System.out.println("name :"+nm.getFirstName()));
        System.out.println("----------------------------------");

        System.out.println("21. No of employees in the organisation.\n");
        System.out.println(
emp.stream().collect(Collectors.counting()));
        System.out.println("-------------------------------");

        System.out.println("22. Find employee count in every department.\n");
        System.out.println( emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())));
        System.out.println("-------------------------------------");

        System.out.println("23. Find the department which has the highest number of employees.\n\n");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())).
                        entrySet().stream().max(Map.Entry.comparingByValue()));
        System.out.println("-------------------------------------");

  //******************* doutb
        System.out.println("24. Sorting a Stream by age and name fields.\n");
        emp.stream().sorted(Comparator.comparing(EmployeeDto::getAge)).forEach(System.out::println);
        System.out.println("---------------------------------");

        System.out.println("25. Print average and total salary of the organization.\n");
        DoubleSummaryStatistics s =
        emp.stream().collect(Collectors.summarizingDouble(EmployeeDto::getSalary));

        System.out.println("Total : "+ s.getSum() +"\n Average :"+s.getAverage());

        System.out.println("26. Print Average salary of each department.\n");
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.averagingInt(EmployeeDto::getSalary))));
        System.out.println("------------------------------");

        System.out.println("27. Print Average salary by gender in each department.\n");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.averagingInt(EmployeeDto::getSalary))));
        System.out.println("------------------------------");

        //=======================doutb
        System.out.println("28. To get a list of employees from each department whose salary is greater than the average salary of their department.\n");
//        System.out.println(
//                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.averagingInt(EmployeeDto::getSalary))).entrySet().stream().filter(e9 ->  e9.getValue()))));
        System.out.println("------------------------------");

        System.out.println("29. Find Highest salary in the organisation.\n");
        System.out.println( emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).findFirst().get());
        System.out.println("------------------------");

        System.out.println("30. Find Second Highest salary in the organisation.\n");
        System.out.println( emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst().get());
        System.out.println("-----------------------------------");
//==============================doutb
        System.out.println("31. Nth Highest salary.");
        System.out.println( emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip( 3).findAny().get());
        System.out.println("------------------------");

        System.out.println("32. Print the top 3 highest salary earned employees in the organisation.");
        System.out.println( emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).limit( 3).collect(Collectors.toList()));
        System.out.println("------------------------");

        System.out.println("33. Print the top 2 highest salary earned employees in each department.");

//======================doutb
        System.out.println(
        emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed())
                                .limit(2)
                                .collect(Collectors.toList())))));
        System.out.println("------------------------");

        //======================doutb
        System.out.println("34. Find highest paid salary in the organisation based on gender.\n");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed())
                                .limit(1)
                                .collect(Collectors.toList())))));


        System.out.println("------------------------");

        System.out.println("35. Find lowest paid salary in the organisation.\n");
        emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).limit(1).forEach(System.out::println);
        System.out.println("------------------------");
//===================doutb
        System.out.println("36. Find lowest paid salary in each department based on the gender.\n");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary))
                                .limit(1)
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        System.out.println("37. Sort the employees salary in the organisation in ascending order.");
emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).forEach(m ->System.out.println("name :"+m.getFirstName()+" " + "Salary :"+m.getSalary()));
        System.out.println("------------------------");

        System.out.println("38. Sort the employees salary in the organisation in decending order.");
        emp.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).forEach(m ->System.out.println("name :"+m.getFirstName()+" " + "Salary :"+m.getSalary()));
        System.out.println("------------------------");

        System.out.println("39. Highest salary based on department.");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed())
                                .limit(1)
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        System.out.println("40. Lowest paid based in each department.\n");

        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary))
                                .limit(1)
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        //==============doutb
        System.out.println("41. List of employee?s second highest record(salary) based on department.\n");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed())
                                .skip(1)
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        System.out.println("42. Sort the employees salary in each department in ascending order.");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary))
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        System.out.println("43. Sort the employees salary in each department in decending order.");
        System.out.println(
                emp.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed())
                                .collect(Collectors.toList())))));

        System.out.println("------------------------");

        System.out.println("44. Find list of employees whose age is less than 30 in Department HR.\n");

        emp.stream().filter(dpt -> dpt.getDepartment().equalsIgnoreCase("hr") && dpt.getAge() < 30).forEach(dp ->System.out.println("name : "+ dp.getFirstName() +"  " + "dept:"+dp.getDepartment() ));

        System.out.println("---------------------------------");
        System.out.println("45. Find the employees whose name start with m.\n");
        emp.stream().filter(mn -> mn.getFirstName().startsWith("M")).forEach(System.out::println);


        List<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(4);
        l.add(7);

        System.out.println(" summing int :");
        System.out.println(  l.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum());

        System.out.println("---------------------------");        // by using  map we get one another type of data by other type of data, dept , age, gem add



    }
}
