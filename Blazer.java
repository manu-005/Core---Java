public class Blazer {
    String brand;
    String color;
    int size;
    String fabric;
    double price;

    public Blazer(String brand) {
        this.brand = brand;
    }

    public Blazer(String color, boolean b) {
        this.color = color;
    }

    public Blazer(int size) {
        this.size = size;
    }

    public Blazer(String fabric, double price) {
        this.fabric = fabric;
        this.price = price;
    }
}
