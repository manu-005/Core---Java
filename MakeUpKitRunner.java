class MakeUpKitRunner {
    public static void main(String[] args) {
        System.out.println("Brand: " + MakeUpKit.getBrand());
        System.out.println("Item Count: " + MakeUpKit.getItemCount());
        System.out.println("Organic: " + MakeUpKit.isOrganic());
        System.out.println("Color Palette: " + MakeUpKit.getColorPalette());
        System.out.println("Price: " + MakeUpKit.getPrice());
    }
}