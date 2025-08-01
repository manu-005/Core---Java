
public class GymEquipment {
    GymEquipment(String name, String type) {
        this.name = name;
    }

    GymEquipment(double weight) {
        this.weight = weight;
    }

    GymEquipment(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    GymEquipment(boolean isElectric) {
        this.isElectric = isElectric;
    }

    String name;
    String type;
    double weight;
    int warrantyYears;
    boolean isElectric;
}


