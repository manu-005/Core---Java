public class AmusementPark {

    String name;
    String location;
    String openingHours;
    int numberOfRides;
    double entryFee;

    AmusementPark(String name, String l) {
        System.out.println("invoked");
        this.name = name;
        this.location = l;
    }
    AmusementPark(String openingHours){
this.openingHours = openingHours;
    }

    AmusementPark(int numberOfRides){
 this.numberOfRides = numberOfRides;
    }
    AmusementPark(double entryFee){

this.entryFee = entryFee;
    }
AmusementPark()
{
    
}

    public void displayInfo() {
        System.out.println("Amusement Park Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Entry Fee: Rs. " + entryFee);
        System.out.println("-----------------------------");
    }
}