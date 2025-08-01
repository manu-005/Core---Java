
public class Marble {
    Marble(String color, String pattern) {
        this.color = color;
    }

    Marble(double size) {
        this.size = size;
    }

    Marble(boolean isShiny) {
        this.isShiny = isShiny;
    }

    Marble(String material) {
        this.material = material;
    }

    String color;
    String pattern;
    double size;
    boolean isShiny;
    String material;
}