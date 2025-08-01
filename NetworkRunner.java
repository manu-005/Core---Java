public class NetworkRunner {
    public static void main(String[] args) {

        Network net1 = new Network("5G");
        System.out.println("Network Type: " + net1.type);

        Network net2 = new Network("Airtel", true);
        System.out.println("Network Provider: " + net2.provider);

        Network net3 = new Network(100);
        System.out.println("Network Speed: " + net3.speed + " Mbps");

        Network net4 = new Network("Fiber Optic", 1500);
        System.out.println("Network Cable Type: " + net4.cable + ", Price: ₹" + net4.cost);
    }
}
