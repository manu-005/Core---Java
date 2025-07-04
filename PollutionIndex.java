class PollutionIndex {
    public static void main(String[] args) {
        indexLevel(200, 4);
        indexLevel(300, 6);
    }
    public static void indexLevel(int totalPollution, int zones) {
        int level = totalPollution / zones;
        System.out.println(level);
    }
}
