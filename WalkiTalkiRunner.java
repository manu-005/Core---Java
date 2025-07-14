class WalkiTalkiRunner {
    public static void main(String[] args) {
        System.out.println("Model: " + WalkiTalki.getModel());
        System.out.println("Range: " + WalkiTalki.getRange());
        System.out.println("Encrypted: " + WalkiTalki.isEncrypted());
        System.out.println("Battery Life: " + WalkiTalki.getBatteryLife());
        System.out.println("Frequency Band: " + WalkiTalki.getFrequencyBand());
    }
}