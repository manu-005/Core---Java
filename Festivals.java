
public class Festivals {
    Festivals(String name, String date) {
        this.name = name;
    }

    Festivals(String location) {
        this.location = location;
    }

    Festivals(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    Festivals(String religion) {
        this.religion = religion;
    }

    String name;
    String date;
    String location;
    boolean isPublicHoliday;
    String religion;
}