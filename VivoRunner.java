class VivoRunner {
    public static void main(String[] args) {
        boolean registered = VivoVal.register("Vivo", "China", 30, true, "Shen Wei");
        System.out.println("Registered: " + registered);
        Vivo.get();
    }
}