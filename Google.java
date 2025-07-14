class Google {
    static String domain;
    static String service;
    static int dailySearches;
    static boolean aiIntegrated;
    static String ceo;

    public static boolean register(String dom, String serv, int searches, boolean ai, String ceoName) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (serv != null)
            service = serv;
        else {
            System.out.println("Invalid service");
            valid = false;
        }
        if (searches > 0)
            dailySearches = searches;
        else {
            System.out.println("Invalid search count");
            valid = false;
        }
        aiIntegrated = ai;
        if (ceoName != null)
            ceo = ceoName;
        else {
            System.out.println("Invalid CEO name");
            valid = false;
        }

        return valid;
    }

    public static void get() {
        System.out.println("Google - " + domain + ", " + service + ", Searches: " + dailySearches + ", AI: "
                + aiIntegrated + ", CEO: " + ceo);
    }
}