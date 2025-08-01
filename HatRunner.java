public class HatRunner {
    public static void main(String[] args) {

        Hat hat1 = new Hat("Wool");
        System.out.println("Hat Material: " + hat1.material);

        Hat hat2 = new Hat("Black", true);
        System.out.println("Hat Color: " + hat2.color);

        Hat hat3 = new Hat(58);
        System.out.println("Hat Size: " + hat3.size + " cm");

        Hat hat4 = new Hat("Fedora", 999);
        System.out.println("Hat Style: " + hat4.style + ", Price: ₹" + hat4.price);
    }
}
