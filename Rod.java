
// Rod.java
public class Rod {
    Rod(String material, double length) {
        this.material = material;
    }

    Rod(double diameter) {
        this.diameter = diameter;
    }

    Rod(boolean isFlexible) {
        this.isFlexible = isFlexible;
    }

    Rod(String usage) {
        this.usage = usage;
    }

    String material;
    double length;
    double diameter;
    boolean isFlexible;
    String usage;
}
