class PoliceStation {
    static String name;
    static String location;
    static String jurisdiction;
    static int officersCount;
    static int vehiclesCount;
    static int cells;
    static String headOfficer;
    static String contactNumber;
    static boolean isHeadquarters;
    static boolean emergencyAvailable;
    static String email;
    static String stationCode;
    static String buildingType;
    static int workingHours;
    static boolean cctvAvailable;
    static int casesFiled;
    static int unsolvedCases;
    static int solvedCases;
    static boolean womenHelpdesk;
    static boolean cyberCell;

    public static void main(String[] args) {
        System.out.println("-----------default Value---------");

        System.out.println("Emergency available" + emergencyAvailable);
        System.out.println("Is Headquaters :" + isHeadquarters);
        System.out.println("Head Officer :" + headOfficer);
        System.out.println("Contact number:" + contactNumber);
        System.out.println("Cells :" + cells);
        System.out.println("Location :" + location);
        System.out.println("Vehicles count :" + vehiclesCount);
        System.out.println("Juridictio :" + jurisdiction);
        System.out.println("Police Station: " + name + ", Officers: " + officersCount);
        System.out.println("CC TV Availability:" + cctvAvailable);
        System.out.println("Is there Cyber cell :" + cyberCell);
        System.out.println("IS there Women Helpdesk :" + womenHelpdesk);
        System.out.println("Solved Cases :" + solvedCases);
        System.out.println("Unsolved Cases:" + unsolvedCases);
        System.out.println("Cases Field :" + casesFiled);
        System.out.println("Working Hours :" + workingHours);
        System.out.println("Building Type:" + buildingType);
        System.out.println("Station code :" + stationCode);
        System.out.println("Email :" + email);
        System.out.println("----------Actual value------------");
        name = "Indiranagar PS";
        location = "Bangalore";
        jurisdiction = "East Zone";
        officersCount = 100;
        vehiclesCount = 12;
        cells = 4;
        headOfficer = "Inspector Ravi";
        contactNumber = "080-100200";
        isHeadquarters = false;
        emergencyAvailable = true;
        email = "indiranagarps@ksp.gov.in";
        stationCode = "PS102";
        buildingType = "Concrete";
        workingHours = 24;
        cctvAvailable = true;
        casesFiled = 5000;
        unsolvedCases = 1200;
        solvedCases = 3800;
        womenHelpdesk = true;
        cyberCell = true;

        System.out.println("Emergency available" + emergencyAvailable);
        System.out.println("Is Headquaters :" + isHeadquarters);
        System.out.println("Head Officer :" + headOfficer);
        System.out.println("Contact number:" + contactNumber);
        System.out.println("Cells :" + cells);
        System.out.println("Location :" + location);
        System.out.println("Vehicles count :" + vehiclesCount);
        System.out.println("Juridictio :" + jurisdiction);
        System.out.println("Police Station: " + name + ", Officers: " + officersCount);
        System.out.println("CC TV Availability:" + cctvAvailable);
        System.out.println("Is there Cyber cell :" + cyberCell);
        System.out.println("IS there Women Helpdesk :" + womenHelpdesk);
        System.out.println("Solved Cases :" + solvedCases);
        System.out.println("Unsolved Cases:" + unsolvedCases);
        System.out.println("Cases Field :" + casesFiled);
        System.out.println("Working Hours :" + workingHours);
        System.out.println("Building Type:" + buildingType);
        System.out.println("Station code :" + stationCode);
        System.out.println("Email :" + email);

    }
}
