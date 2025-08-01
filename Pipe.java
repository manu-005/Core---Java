public class Pipe {
    Pipe(String material, double length) {
        this.material = material;
    }

    Pipe(double diameter) {
        this.diameter = diameter;
    }

    Pipe(boolean isFlexible) {
        this.isFlexible = isFlexible;
    }

    Pipe(String color) {
        this.color = color;
    }

    String material;
    double length;
    double diameter;
    boolean isFlexible;
    String color;
}