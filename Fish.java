
public class Fish {
    Fish(String type, String color) {
        this.type = type;
    }

    Fish(double weight) {
        this.weight = weight;
    }

    Fish(boolean isFreshwater) {
        this.isFreshwater = isFreshwater;
    }

    Fish(String habitat) {
        this.habitat = habitat;
    }

    String type;
    String color;
    double weight;
    boolean isFreshwater;
    String habitat;
}