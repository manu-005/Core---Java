public class WeaponRunner {
    public static void main(String[] args) {

        Weapon weapon1 = new Weapon("Sword");
        System.out.println("Weapon Type: " + weapon1.type);

        Weapon weapon2 = new Weapon("Iron", true);
        System.out.println("Weapon Material: " + weapon2.material);

        Weapon weapon3 = new Weapon(3.5);
        System.out.println("Weapon Weight: " + weapon3.weight + " kg");

        Weapon weapon4 = new Weapon("Ancient", 50000);
        System.out.println("Weapon Category: " + weapon4.category + ", Price: ₹" + weapon4.price);
    }
}
