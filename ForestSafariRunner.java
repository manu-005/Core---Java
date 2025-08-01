public class ForestSafariRunner {
    public static void main(String[] args) {

        ForestSafari safari1 = new ForestSafari("Jim Corbett");
        System.out.println("Safari Name: " + safari1.name);

        ForestSafari safari2 = new ForestSafari("Jeep", true);
        System.out.println("Safari Type: " + safari2.type);

        ForestSafari safari3 = new ForestSafari(3.5);
        System.out.println("Safari Duration: " + safari3.duration + " hours");

        ForestSafari safari4 = new ForestSafari("Morning Slot", 2500);
        System.out.println("Safari Slot: " + safari4.slot + ", Ticket Price: ₹" + safari4.price);
    }
}
