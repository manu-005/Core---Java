class SoilQualityCheck {
    public static void main(String[] args) {
        soilDifference(55, 25);
        soilDifference(90, 60);
    }
    public static void soilDifference(int max, int min) {
        int diff = max - min;
        System.out.println(diff);
    }
}
