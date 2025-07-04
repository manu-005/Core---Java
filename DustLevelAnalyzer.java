class DustLevelAnalyzer {
    public static void main(String[] args) {
        calcDustLevel(300, 3);
        calcDustLevel(600, 6);
    }
    public static void calcDustLevel(int particles, int hours) {
        int level = particles / hours;
        System.out.println(level);
    }
}
