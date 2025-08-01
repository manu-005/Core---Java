public class CrackersRunner {
    public static void main(String[] args) {
String crack[]={"Tan Crackers", "Rockets", "Circles", "Sparkles", "blast"};

        Crackers c1 = new Crackers("Tan Crackers", "Rockets");
        System.out.println("Cracker Brand: " + c1.brand + ", Type: " + c1.type);
        Crackers c2 = new Crackers(100.00, crack);
        System.out.println("Cracker Price: ₹" + c2.price);
        c2.getCrackers();
       
        Crackers c4 = new Crackers(200);
        System.out.println("Cracker Quantity: " + c4.quantity);

        Crackers c3 = new Crackers(true);
        System.out.println("Is Cracker Loud: " + c3.isLoud);
    }
}