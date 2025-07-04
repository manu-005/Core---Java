class SolarRadiation {
    public static void main(String[] args) {
        totalRadiation(200, 10);
        totalRadiation(300, 5);
    }
    public static void totalRadiation(int radiation, int hours) {
        int total = radiation * hours;
        System.out.println(total);
    }
}
