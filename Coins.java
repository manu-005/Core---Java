 class Coins {
    Coins(String country, String value) {
        this.country = country;
        this.value = value;
    }

    Coins(int year) {
        this.year = year;
    }

    Coins(String metal, int diameter) {
        this.metal = metal;
        this.diameter = diameter;
    }

    Coins(boolean isRare) {
        this.isRare = isRare;
    }

    String country;
    String value;
    int year;
    String metal;
    double diameter;
    boolean isRare;
}
