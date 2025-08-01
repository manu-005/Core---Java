public class GymEquipementRunner {
    public static void main(String[] args) {

        GymEquipement equip1 = new GymEquipement("Treadmill");
        System.out.println("Equipment Type: " + equip1.type);

        GymEquipement equip2 = new GymEquipement("Iron", true);
        System.out.println("Equipment Material: " + equip2.material);

        GymEquipement equip3 = new GymEquipement(50.0);
        System.out.println("Equipment Weight: " + equip3.weight + " kg");

        GymEquipement equip4 = new GymEquipement("Multifunctional", 25000);
        System.out.println("Equipment Feature: " + equip4.feature + ", Price: ₹" + equip4.price);
    }
}
