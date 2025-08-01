
public class Crackers {
    Crackers(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Crackers(int quantity) {
        this.quantity = quantity;
    }

    Crackers(boolean isLoud) {
        this.isLoud = isLoud;
    }

    Crackers(double price,String crack[]) {
        this.price = price;
        this.crack = crack;
    }
void getCrackers()
{
    System.out.println("Crackers are available in different types and brands.");
    for(String c:crack)
    {
        System.out.println(c);
    }
}
    String brand;
    String type;
    int quantity;
    boolean isLoud;
    double price;
    String crack[];
   
}