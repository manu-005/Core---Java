class Twitter {
    static String domain;
    static String owner;
    static int tweetsPerDay;
    static boolean blueTick;
    static String theme;

    public static boolean register(String dom, String own, int tweets, boolean tick, String thm) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (own != null)
            owner = own;
        else {
            System.out.println("Invalid owner");
            valid = false;
        }
        if (tweets > 0)
            tweetsPerDay = tweets;
        else {
            System.out.println("Invalid tweet count");
            valid = false;
        }
        blueTick = tick;
        if (thm != null)
            theme = thm;
        else {
            System.out.println("Invalid theme");
            valid = false;
        }

        return valid;
    }

    public static void get() {
        System.out.println("Twitter - " + domain + ", Owner: " + owner + ", Tweets/Day: " + tweetsPerDay
                + ", BlueTick: " + blueTick + ", Theme: " + theme);
    }
}