class LightPollution {
    public static void main(String[] args) {
        calcLight(800, 20);
        calcLight(900, 30);
    }
    public static void calcLight(int lux, int area) {
        int result = lux / area;
        System.out.println(result);
    }
}
