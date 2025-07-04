class GasLeakDetector {
    public static void main(String[] args) {
        leakAmount(50, 30);
        leakAmount(70, 20);
    }
    public static void leakAmount(int input, int output) {
        int result = input - output;
        System.out.println(result);
    }
}