class HeatIndex {
    public static void main(String[] args) {
        computeHeat(40, 5);
        computeHeat(60, 3);
    }
    public static void computeHeat(int temp, int time) {
        int result = temp * time;
        System.out.println(result);
    }
}
