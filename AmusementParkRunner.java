public class AmusementParkRunner {
    public static void main(String[] args) {
            AmusementPark park1 = new AmusementPark("Wonderla", "Bangalore");
            park1.name = "Wonderla";
            park1.location = "Bangalore";
        System.out.println("Amusement Park Location: " + park1.location);
        System.out.println("Amusement Park Name: " + park1.name);
      
       AmusementPark park2 = new AmusementPark( "11 AM - 9 PM");
       System.out.println("Opening Hours :"+ park2.openingHours);  

        AmusementPark park3 = new AmusementPark(25);
        System.out.println("Number of Rides :"+ park3.numberOfRides);

        AmusementPark park4 = new AmusementPark(450.0);
        System.out.println("Entry Fees is :"+ park4.entryFee); 

    }   
}