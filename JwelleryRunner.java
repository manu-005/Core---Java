public class JwelleryRunner {
    public static void main(String[] args) {

        Jwellery j1 = new Jwellery("Necklace");
        System.out.println("Jewellery Type: " + j1.type);

        Jwellery j2 = new Jwellery("Gold", true);
        System.out.println("Jewellery Material: " + j2.material);

        Jwellery j3 = new Jwellery(22);
        System.out.println("Jewellery Karat: " + j3.karat + "K");

        Jwellery j4 = new Jwellery("Traditional", 150000);
        System.out.println("Jewellery Style: " + j4.style + ", Price: ₹" + j4.price);
    }
}
