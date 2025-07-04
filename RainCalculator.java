class RainCalculator {
    public static void main(String[] args) {
        rainCollected(10, 5);
        rainCollected(20, 10);
    }
    public static void rainCollected(int rain, int area) {
        int collected = rain * area;
        System.out.println(collected);
    }
}
