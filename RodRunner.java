public class RodRunner {
    public static void main(String[] args) {

        Rod rod1 = new Rod("Steel");
        System.out.println("Rod Material: " + rod1.material);

        Rod rod2 = new Rod(6.0);
        System.out.println("Rod Length: " + rod2.length + " m");

        Rod rod3 = new Rod("Round", true);
        System.out.println("Rod Shape: " + rod3.shape);

        Rod rod4 = new Rod("Construction", 300);
        System.out.println("Rod Use: " + rod4.use + ", Cost per unit: ₹" + rod4.cost);
    }
}
