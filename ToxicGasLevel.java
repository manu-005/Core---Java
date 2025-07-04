class ToxicGasLevel {
    public static void main(String[] args) {
        netToxicity(500, 450);
        netToxicity(600, 580);
    }
    public static void netToxicity(int input, int output) {
        int result = input - output;
        System.out.println(result);
    }
}
