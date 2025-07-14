class YouTube {
    static String domain;
    static String contentType;
    static int dailyViews;
    static boolean monetized;
    static String owner;

    public static boolean register(String dom, String type, int views, boolean monet, String own) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (type != null)
            contentType = type;
        else {
            System.out.println("Invalid content type");
            valid = false;
        }
        if (views > 0)
            dailyViews = views;
        else {
            System.out.println("Views must be positive");
            valid = false;
        }
        monetized = monet;
        if (own != null)
            owner = own;
        else {
            System.out.println("Invalid owner");
            valid = false;
        }

        return valid;
    }

    public static void get() {
        System.out.println("YouTube - " + domain + ", " + contentType + ", Views: " + dailyViews + ", Monetized: "
                + monetized + ", Owner: " + owner);
    }
}