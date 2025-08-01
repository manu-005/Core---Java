
public class Hat {
    Hat(String style, String material) {
        this.style = style;
    }

    Hat(double size) {
        this.size = size;
    }

    Hat(boolean hasBrim) {
        this.hasBrim = hasBrim;
    }

    Hat(String brand) {
        this.brand = brand;
    }

    String style;
    String material;
    double size;
    boolean hasBrim;
    String brand;
}