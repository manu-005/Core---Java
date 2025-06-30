class SolarSystem {
    static int totalPlanets;
    static int dwarfPlanets;
    static String sunType;
    static double totalMass;
    static double diameter;
    static int moons;
    static boolean hasAsteroidBelt;
    static boolean hasKuiperBelt;
    static boolean hasOortCloud;
    static int cometsObserved;
    static int satellites;
    static String age;
    static boolean habitableZonePresent;
    static String galaxy;
    static int numberOfStars;
    static boolean exoplanetsObserved;
    static String originTheory;
    static boolean hasSpaceMissions;
    static int discoveredObjects;
    static String gravitationalCenter;

    public static void main(String[] ar) {

        System.out.println("--------Default Values--------");
        System.out.println("gravitationalCenter" + gravitationalCenter);
        System.out.println("hasSpaceMissions" + hasSpaceMissions);
        System.out.println("originTheory" + originTheory);
        System.out.println("discoveredObjects" + discoveredObjects);
        System.out.println("age" + age);
        System.out.println("satellites" + satellites);
        System.out.println("cometsObserved" + cometsObserved);
        System.out.println("hasOortCloud" + hasOortCloud);
        System.out.println("totalMass" + totalMass);
        System.out.println("hasKuiperBelt" + hasKuiperBelt);
        System.out.println("hasAsteroidBelt" + hasAsteroidBelt);
        System.out.println("diameter" + diameter);
        System.out.println("dwarfPlanets" + dwarfPlanets);
        System.out.println("moons" + moons);
        System.out.println("Solar System - Planets: " + totalPlanets + ", Star Type: " + sunType);
        System.out.println("galaxy" + galaxy);
        System.out.println("habitableZonePresent:" + habitableZonePresent);
        System.out.println("number of stars:" + numberOfStars);
        System.out.println("explanetObserved" + exoplanetsObserved);
        System.out.println("--------Actual Values--------");

        totalPlanets = 2;
        dwarfPlanets = 8;
        sunType = "RED";
        totalMass = 1.0014e30;
        diameter = 420.e3;
        moons = 50;
        hasAsteroidBelt = true;
        hasKuiperBelt = true;
        hasOortCloud = true;
        cometsObserved = 200;
        satellites = 10;
        age = "6 billion years";
        habitableZonePresent = true;
        galaxy = "Milky";
        numberOfStars = 10;
        exoplanetsObserved = true;
        originTheory = "polar";
        hasSpaceMissions = true;
        discoveredObjects = 500000;
        gravitationalCenter = "Sum";

        System.out.println("gravitationalCenter" + gravitationalCenter);
        System.out.println("hasSpaceMissions" + hasSpaceMissions);
        System.out.println("originTheory" + originTheory);
        System.out.println("discoveredObjects" + discoveredObjects);
        System.out.println("age" + age);
        System.out.println("satellites" + satellites);
        System.out.println("cometsObserved" + cometsObserved);
        System.out.println("hasOortCloud" + hasOortCloud);
        System.out.println("totalMass" + totalMass);
        System.out.println("hasKuiperBelt" + hasKuiperBelt);
        System.out.println("hasAsteroidBelt" + hasAsteroidBelt);
        System.out.println("diameter" + diameter);
        System.out.println("dwarfPlanets" + dwarfPlanets);
        System.out.println("moons" + moons);
        System.out.println("Solar System - Planets: " + totalPlanets + ", Star Type: " + sunType);
        System.out.println("galaxy" + galaxy);
        System.out.println("habitableZonePresent:" + habitableZonePresent);
        System.out.println("number of stars:" + numberOfStars);
        System.out.println("explanetObserved" + exoplanetsObserved);
    }
}
