public class ForestSafari {
    ForestSafari(String name, String location) {
        this.name = name;
    }

    ForestSafari(int animalCount) {
        this.animalCount = animalCount;
    }

    ForestSafari(boolean isGuided) {
        this.isGuided = isGuided;
    }

    ForestSafari(String season) {
        this.season = season;
    }

    String name;
    String location;
    int animalCount;
    boolean isGuided;
    String season;
}