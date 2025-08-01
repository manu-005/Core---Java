public class PipeRunner {
    public static void main(String[] args) {

        Pipe pipe1 = new Pipe("PVC");
        System.out.println("Pipe Material: " + pipe1.material);

        Pipe pipe2 = new Pipe(2.5);
        System.out.println("Pipe Diameter: " + pipe2.diameter + " inches");

        Pipe pipe3 = new Pipe("Blue", true);
        System.out.println("Pipe Color: " + pipe3.color);

        Pipe pipe4 = new Pipe("Drainage", 300);
        System.out.println("Pipe Use: " + pipe4.use + ", Price: ₹" + pipe4.price);
    }
}
