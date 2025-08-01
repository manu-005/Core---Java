public class HairClip {
    HairClip(String material, String color) {
        this.material = material;
    }

    HairClip(double size) {
        this.size = size;
    }

    HairClip(String design, boolean hasPattern) {
        this.design = design;
    }

    HairClip(double price, String brand) {
        this.price = price;
    }

    String material;
    String color;
    double size;
    String design;
    boolean hasPattern;
    double price;
    String brand;
}
