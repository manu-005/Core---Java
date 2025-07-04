class WaterConsumption {
    public static void main(String[] args) {
        computeLiters(100, 4);
        computeLiters(90, 3);
    }
    public static void computeLiters(int liters, int people) {
        int result = liters / people;
        System.out.println(result);
    }
}
