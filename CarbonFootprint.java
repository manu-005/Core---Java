class CarbonFootprint {
    public static void main(String[] args) {
        footprintCalc(1000, 20);
        footprintCalc(800, 16);
    }
    public static void footprintCalc(int emissions, int people) {
        int result = emissions / people;
        System.out.println(result);
    }
}
