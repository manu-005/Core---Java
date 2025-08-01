public class CoinsRunner {
    public static void main(String[] args) {

        Coins coin1 = new Coins("Indian Rupee", "Ten");
        System.out.println("Coin Country: " + coin1.country + ", Coin Value: " + coin1.value);

        Coins coin2 = new Coins(100);
        System.out.println("Coin Year: " + coin2.year);

        Coins coin3 = new Coins("Copper", 25);
        System.out.println("Coin Metal: " + coin3.metal + ", Coin Diameter: " + coin3.diameter);

        Coins coin4 = new Coins(true);
        System.out.println("Is Rare: " + coin4.isRare);
    }
}
