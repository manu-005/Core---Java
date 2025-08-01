public class HairClipRunner {
    public static void main(String[] args) {

        HairClip clip1 = new HairClip("Plastic");
        System.out.println("HairClip Material: " + clip1.material);

        HairClip clip2 = new HairClip("Black", true);
        System.out.println("HairClip Color: " + clip2.color);

        HairClip clip3 = new HairClip(5.5);
        System.out.println("HairClip Length: " + clip3.length + " cm");

        HairClip clip4 = new HairClip("Floral", 20);
        System.out.println("HairClip Design: " + clip4.design + ", Price: ₹" + clip4.price);
    }
}
