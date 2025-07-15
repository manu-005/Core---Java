class TwitterRunner {
    public static void main(String[] args) {
        boolean registered = TwitterVal.register("twitter.com", "Elon Musk", 800000000, true, "Blue");
        System.out.println("Registered: " + registered);
        Twitter.get();
    }
}