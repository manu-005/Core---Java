public class CoinsRunner {
    public static void main(String[] args) {

        Coins coin1 = new Coins();
        coin1.material = "Gold";
        coin1.origin = "India";
        coin1.year = 1990;
        coin1.diameter = 2.5;
        coin1.symbol = "INR";

        System.out.println("\nCoins Details:");
        System.out.println("Material: " + coin1.material);
        System.out.println("Origin: " + coin1.origin);
        System.out.println("Year: " + coin1.year);
        System.out.println("Diameter: " + coin1.diameter);
        System.out.println("Symbol: " + coin1.symbol);

        Coins coin2 = new Coins();
        coin2.material = "Silver";
        coin2.origin = "USA";
        coin2.year = 1985;
        coin2.diameter = 2.3;
        coin2.symbol = "USD";

        System.out.println("\nCoins Details:");
        System.out.println("Material: " + coin2.material);
        System.out.println("Origin: " + coin2.origin);
        System.out.println("Year: " + coin2.year);
        System.out.println("Diameter: " + coin2.diameter);
        System.out.println("Symbol: " + coin2.symbol);

        Coins coin3 = new Coins();
        coin3.material = "Copper";
        coin3.origin = "UK";
        coin3.year = 2000;
        coin3.diameter = 2.1;
        coin3.symbol = "GBP";

        System.out.println("\nCoins Details:");
        System.out.println("Material: " + coin3.material);
        System.out.println("Origin: " + coin3.origin);
        System.out.println("Year: " + coin3.year);
        System.out.println("Diameter: " + coin3.diameter);
        System.out.println("Symbol: " + coin3.symbol);

        Coins coin4 = new Coins();
        coin4.material = "Nickel";
        coin4.origin = "Japan";
        coin4.year = 2010;
        coin4.diameter = 2.2;
        coin4.symbol = "YEN";

        System.out.println("\nCoins Details:");
        System.out.println("Material: " + coin4.material);
        System.out.println("Origin: " + coin4.origin);
        System.out.println("Year: " + coin4.year);
        System.out.println("Diameter: " + coin4.diameter);
        System.out.println("Symbol: " + coin4.symbol);

        Coins coin5 = new Coins();
        coin5.material = "Bronze";
        coin5.origin = "Germany";
        coin5.year = 1975;
        coin5.diameter = 2.6;
        coin5.symbol = "EUR";

        System.out.println("\nCoins Details:");
        System.out.println("Material: " + coin5.material);
        System.out.println("Origin: " + coin5.origin);
        System.out.println("Year: " + coin5.year);
        System.out.println("Diameter: " + coin5.diameter);
        System.out.println("Symbol: " + coin5.symbol);
    }
}
