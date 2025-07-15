class SumSangVal{
    static String brand;
    static String origin;
    static int devices;
    static boolean smartTech;
    static String founder;

    public static boolean register(String b, String o, int d, boolean tech, String f) {
        boolean valid = true;

        if (b != null)
            brand = b;
        else {
            System.out.println("Invalid brand");
            valid = false;
        }
        if (o != null)
            origin = o;
        else {
            System.out.println("Invalid origin");
            valid = false;
        }
        if (d > 0)
            devices = d;
        else {
            System.out.println("Invalid device count");
            valid = false;
        }
        smartTech = tech;
        if (f != null)
            founder = f;
        else {
            System.out.println("Invalid founder");
            valid = false;
        }

        return valid;
    }

}