class MarketRunner {
    public static void main(String[] args) {
        System.out.println("Market Name: " + Market.getName());
        System.out.println("Location: " + Market.getLocation());
        System.out.println("Shops: " + Market.getNumberOfShops());
        System.out.println("Type: " + Market.getMarketType());
        System.out.println("Opening Hours: " + Market.getOpeningHours());
    }
}