class TemperatureAnalyzer {
    public static void main(String[] args) {
        calculateAverage(30, 3);
        calculateAverage(50, 5);
    }
    public static void calculateAverage(int totalTemp, int days) {
        int avg = totalTemp / days;
        System.out.println(avg);
    }
}
