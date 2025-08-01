
public class Karate {
    Karate(String beltColor, int level) {
        this.beltColor = beltColor;
    }

    Karate(boolean isCompetitive) {
        this.isCompetitive = isCompetitive;
    }

    Karate(String dojo) {
        this.dojo = dojo;
    }

    Karate(int trainingHours) {
        this.trainingHours = trainingHours;
    }

    String beltColor;
    int level;
    boolean isCompetitive;
    String dojo;
    int trainingHours;
}