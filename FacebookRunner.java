class FacebookRunner {
    public static void main(String[] args) {
        boolean registered = FacebookValidator.register("facebook.com", "Mark Zuckerberg", 300, true, "2004");
        System.out.println("Registered: " + registered);
        Facebook.get();
    }
}