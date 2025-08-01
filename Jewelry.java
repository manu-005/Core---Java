
public class Jewelry {
    Jewelry(String type, String metal) {
        this.type = type;
    }

    Jewelry(double weight) {
        this.weight = weight;
    }

    Jewelry(boolean hasGemstone) {
        this.hasGemstone = hasGemstone;
    }

    Jewelry(String design) {
        this.design = design;
    }

    String type;
    String metal;
    double weight;
    boolean hasGemstone;
    String design;
}