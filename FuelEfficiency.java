class FuelEfficiency {
    public static void main(String[] args) {
        efficiencyCalc(500, 50);
        efficiencyCalc(600, 60);
    }
    public static void efficiencyCalc(int km, int fuel) {
        int efficiency = km / fuel;
        System.out.println(efficiency);
    }
}
