class NoiseMonitor {
    public static void main(String[] args) {
        calcNoise(80, 30);
        calcNoise(100, 50);
    }
    public static void calcNoise(int max, int min) {
        int result = max - min;
        System.out.println(result);
    }
}
