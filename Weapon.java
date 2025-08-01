public class Weapon {
    Weapon(String type, double weight) {
        this.type = type;
    }

    Weapon(int range) {
        this.range = range;
    }

    Weapon(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    Weapon(String originCountry) {
        this.originCountry = originCountry;
    }

    String type;
    double weight;
    int range;
    boolean isAutomatic;
    String originCountry;
}