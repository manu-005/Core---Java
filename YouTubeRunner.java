class YouTubeRunner {
    public static void main(String[] args) {
        boolean registered = YouTubeVal.register("youtube.com", "Entertainment", 100000000, true, "Google");
        System.out.println("Registered: " + registered);
        YouTube.get();
    }
}