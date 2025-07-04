class WindSpeedChecker {
    public static void main(String[] args) {
        windVariation(70, 30);
        windVariation(90, 40);
    }
    public static void windVariation(int max, int min) {
        int variation = max - min;
        System.out.println(variation);
    }
}
