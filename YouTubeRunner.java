class YouTubeRunner {
    public static void main(String[] args) {
        boolean registered = YouTube.register("youtube.com", "Entertainment", 100000000, true, "Google");
        System.out.println("Registered: " + registered);
        YouTube.get();
    }
}