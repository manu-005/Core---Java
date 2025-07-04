class SmogLevel {
    public static void main(String[] args) {
        netSmog(1000, 800);
        netSmog(1200, 1100);
    }
    public static void netSmog(int day, int night) {
        int smog = day - night;
        System.out.println(smog);
    }
}
