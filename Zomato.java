class Zomato {
    static String domain;
    static String baseCity;
    static int partners;
    static boolean delivery;
    static String founder;

    public static boolean register(String dom, String city, int rest, boolean del, String f) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (city != null)
            baseCity = city;
        else {
            System.out.println("Invalid city");
            valid = false;
        }
        if (rest > 0)
            partners = rest;
        else {
            System.out.println("Invalid count");
            valid = false;
        }
        delivery = del;
        if (f != null)
            founder = f;
        else {
            System.out.println("Invalid founder");
            valid = false;
        }

        return valid;
    }

    public static void get() {
        System.out.println("Zomato - " + domain + ", " + baseCity + ", Partners: " + partners + ", Delivery: "
                + delivery + ", Founder: " + founder);
    }
}