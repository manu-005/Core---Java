class PressureMonitor {
    public static void main(String[] args) {
        getPressureDrop(100, 20);
        getPressureDrop(150, 30);
    }
    public static void getPressureDrop(int initial, int finalP) {
        int drop = initial - finalP;
        System.out.println(drop);
    }
}
