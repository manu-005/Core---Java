class LinkedInVal{
     static String domain;
    static String focus;
    static int connections;
    static boolean premium;
    static String ceo;

    public static boolean register(String dom, String f, int conn, boolean prem, String ceoName) {
        boolean valid = true;

        if (dom != null)
            domain = dom;
        else {
            System.out.println("Invalid domain");
            valid = false;
        }
        if (f != null)
            focus = f;
        else {
            System.out.println("Invalid focus");
            valid = false;
        }
        if (conn > 0)
            connections = conn;
        else {
            System.out.println("Invalid connection count");
            valid = false;
        }
        premium = prem;
        if (ceoName != null)
            ceo = ceoName;
        else {
            System.out.println("Invalid CEO");
            valid = false;
        }

        return valid;
    }

}