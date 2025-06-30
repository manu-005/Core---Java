class Trip {
    public static void main(String[] ar) {
        String tourismPlaces[] = { "Taj Mahal", "Qutub Minar", "Red Fort", "Charminar", "India Gate", "Mysore Palace",
                "Gateway of India", "Hampi", "Backwaters", "Ajanta Caves", "Sundarbans", "Ladakh", "Ranthambore",
                "Darjeeling", "Rishikesh" };

        System.out.println(tourismPlaces[0] + " " + tourismPlaces[1] + " " + tourismPlaces[2] + " " + tourismPlaces[3]
                + " " + tourismPlaces[4] + " " +
                tourismPlaces[5] + " " + tourismPlaces[6] + " " + tourismPlaces[7] + " " + tourismPlaces[8] + " "
                + tourismPlaces[9] + " " +
                tourismPlaces[10] + " " + tourismPlaces[11] + " " + tourismPlaces[12] + " " + tourismPlaces[13] + " "
                + tourismPlaces[14]);
        for (String tour : tourismPlaces) {
            System.out.println(tour);
        }
    }
}