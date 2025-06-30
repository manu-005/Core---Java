class Ipl {
    public static void main(String[] ar) {
        String iplTeams[] = { "Chennai Super Kings", "Kolkata Knight Riders", "Rajasthan Royals",
                "Royal Challengers Bengaluru", "Punjab Kings", "Mumbai Indians", "Sunrisers Hyderabad",
                "Gujarat Titans", "Delhi Capitals", "Lucknow Super Giants" };

        System.out.println(
                iplTeams[0] + " " + iplTeams[1] + " " + iplTeams[2] + " " + iplTeams[3] + " " + iplTeams[4] + " " +
                        iplTeams[5] + " " + iplTeams[6] + " " + iplTeams[7] + " " + iplTeams[8] + " " + iplTeams[9]);
        for (String ipl : iplTeams) {
            System.out.println(ipl);
        }
    }
}