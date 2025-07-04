class AirFlowCalculator {
    public static void main(String[] args) {
        totalAirFlow(60, 3);
        totalAirFlow(90, 3);
    }
    public static void totalAirFlow(int rate, int time) {
        int total = rate * time;
        System.out.println(total);
    }
}
