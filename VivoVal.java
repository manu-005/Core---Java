class VivoVal{
     static String brand;
    static String country;
    static int phoneModels;
    static boolean androidBased;
    static String ceo;

    public static boolean register(String b, String c, int models, boolean android, String ceoName) {
        boolean valid = true;

        if (b != null)
            brand = b;
        else {
            System.out.println("Invalid brand");
            valid = false;
        }
        if (c != null)
            country = c;
        else {
            System.out.println("Invalid country");
            valid = false;
        }
        if (models > 0)
            phoneModels = models;
        else {
            System.out.println("Invalid model count");
            valid = false;
        }
        androidBased = android;
        if (ceoName != null)
            ceo = ceoName;
        else {
            System.out.println("Invalid CEO name");
            valid = false;
        }

        return valid;
    }
}