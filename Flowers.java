
public class Flowers {
    Flowers(String type, String color) {
        this.type = type;
    }

    Flowers(int petalCount) {
        this.petalCount = petalCount;
    }

    Flowers(boolean hasFragrance) {
        this.hasFragrance = hasFragrance;
    }

    Flowers(String season) {
        this.season = season;
    }

    String type;
    String color;
    int petalCount;
    boolean hasFragrance;
    String season;
}
