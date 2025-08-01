public class FestivalsRunner {
    public static void main(String[] args) {

        Festivals fest1 = new Festivals("Diwali");
        System.out.println("Festival Name: " + fest1.name);

        Festivals fest2 = new Festivals("India", true);
        System.out.println("Festival Country: " + fest2.country);

        Festivals fest3 = new Festivals(5);
        System.out.println("Festival Duration: " + fest3.days + " days");

        Festivals fest4 = new Festivals("Lights", "Religious");
        System.out.println("Theme: " + fest4.theme + ", Type: " + fest4.type);
    }
}
