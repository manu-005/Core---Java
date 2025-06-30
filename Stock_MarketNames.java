class Stock_MarketNames {
    public static void main(String[] ar) {
        String stock_MarketNames[] = { "New York Stock Exchange (NYSE)", "NASDAQ", "London Stock Exchange (LSE)",
                "Tokyo Stock Exchange (TSE)", "Shanghai Stock Exchange (SSE)", "Hong Kong Stock Exchange (HKEX)",
                "Euronext", "Toronto Stock Exchange (TSX)", "Bombay Stock Exchange (BSE)",
                "National Stock Exchange of India (NSE)" };
        for (String market : stock_MarketNames) {
            System.out.println(market);
        }
    }
}