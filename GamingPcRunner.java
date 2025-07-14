class GamingPcRunner {
    public static void main(String[] args) {
        System.out.println("Processor: " + GamingPc.getProcessor());
        System.out.println("RAM: " + GamingPc.getRam());
        System.out.println("Storage: " + GamingPc.getStorage());
        System.out.println("GPU: " + GamingPc.getGpu());
        System.out.println("RGB: " + GamingPc.hasRGB());
    }
}