class Bangalore {
    public static void main(String[] ar) {
        String bangalore_AreaNames[] = { "Koramangala", "Whitefield", "hebbala", "kempaura", "R T Nagar", "Nagavara",
                "Kalyan Nagar", "Yelahanka", "Rajaji Nagar", "Bommasandra" };

        System.out.println(bangalore_AreaNames[0] + " " + bangalore_AreaNames[1] + " " + bangalore_AreaNames[3] + " "
                + bangalore_AreaNames[4] + " " + bangalore_AreaNames[5] + " " + bangalore_AreaNames[6] + " "
                + bangalore_AreaNames[7] + " " + bangalore_AreaNames[8]);
        for (String bglr : bangalore_AreaNames) {
            System.out.println(bglr);
        }
    }
}