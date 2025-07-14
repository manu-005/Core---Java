class ZomatoRunner {
    public static void main(String[] args) {
        boolean registered = Zomato.register("zomato.com", "Delhi", 50000, true, "Deepinder Goyal");
        System.out.println("Registered: " + registered);
        Zomato.get();
    }
}