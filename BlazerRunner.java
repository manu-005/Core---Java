public class BlazerRunner {
    public static void main(String[] args) {

        Blazer blazer1 = new Blazer("Raymond");
        System.out.println("Blazer Brand: " + blazer1.brand);

        Blazer blazer2 = new Blazer("Navy Blue", true);
        System.out.println("Blazer Color: " + blazer2.color);

        Blazer blazer3 = new Blazer(42);
        System.out.println("Blazer Size: " + blazer3.size);

        Blazer blazer4 = new Blazer("Wool Blend", 4999.99);
        System.out.println("Blazer Fabric: " + blazer4.fabric + ", Price: ₹" + blazer4.price);
    }
}
