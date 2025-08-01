
public class Casino {
    Casino(String name, String location) {
        this.name = name;
        this.location = location;
    }

    Casino(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    Casino(boolean is24Hours) {
        this.is24Hours = is24Hours;
    }

    Casino(String owner) {
        this.owner = owner;
    }

    String name;
    String location;
    int gamesCount;
    boolean is24Hours;
    String owner;
}