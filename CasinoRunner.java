class CasinoRunner{
    public static void main(String[] args) {
        Casino casino1 = new Casino("Casino Royale", "Las Vegas");
                System.out.println("Casino Name: " + casino1.name + ", Location: " + casino1.location);
        Casino casino2 = new Casino(500);
        System.out.println("Games Count: " + casino2.gamesCount);

        Casino casino3 = new Casino(true);
        System.out.println("Is Open 24 Hours: " + casino3.is24Hours);
 
 Casino casino4 = new Casino("John Smith");
        System.out.println("Casino Owner: " + casino4.owner);
        
    }
}