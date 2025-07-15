class SumSangRunner {
    public static void main(String[] args) {
        boolean registered = SumSangVal.register("Samsung", "South Korea", 120, true, "Lee Byung-chul");
        System.out.println("Registered: " + registered);
        SumSang.get();
    }
}