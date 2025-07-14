class GoogleRunner {
    public static void main(String[] args) {
        boolean registered = Google.register("google.com", "Search Engine", 1000000000, true, "Sundar Pichai");
        System.out.println("Registered: " + registered);
        Google.get();
    }
}