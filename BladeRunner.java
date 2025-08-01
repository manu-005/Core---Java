public class BladeRunner {
    public static void main(String[] args) {
        

        Blade blade1 = new Blade("Steel");
       System.out.println("Blade Material: " + blade1.material);

        Blade blade2 = new Blade(5.0);
       System.out.println("Blade Length: " + blade2.length + " cm");

        Blade blade3 = new Blade( 2.8, 0.25);
        System.out.println("Blade Width: " + blade3.width + " cm, Thickness: " + blade3.thickness + " cm");
     
        Blade blade4 = new Blade("Sharp");
        System.out.println("Blade Sharpness: " + blade4.sharpness);
 }
}