class Facebook {
    static String domain;
    static String founder;
    static int users;
    static boolean metaOwned;
    static String launched;

    public static boolean register(String dom, String f, int usr, boolean meta, String date) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (f != null)
            founder = f;
        else {
            System.out.println("Invalid founder");
            valid = false;
        }
        if (usr > 0)
            users = usr;
        else {
            System.out.println("Invalid user count");
            valid = false;
        }
        metaOwned = meta;
        if (date != null)
            launched = date;
        else {
            System.out.println("Invalid launch date");
            valid = false;
        }

        return valid;
    }

    public static void get() {
        System.out.println("Facebook - " + domain + ", Founder: " + founder + ", Users: " + users + ", Meta: "
                + metaOwned + ", Launched: " + launched);
    }
}