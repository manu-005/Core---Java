public class Politician {
    Politician(String name, String party) {
        this.name = name;
    }

    Politician(int age) {
        this.age = age;
    }

    Politician(boolean isIncumbent) {
        this.isIncumbent = isIncumbent;
    }

    Politician(String position) {
        this.position = position;
    }

    String name;
    String party;
    int age;
    boolean isIncumbent;
    String position;
}
