public class ChatShop {
    public static void main(String[] ar) {
        String chatShop[] = { "Samosa", "Puff", "Veg Sandwich", "Cheese Burger", "French Fries", "Paneer Roll", "Maggi",
                "Cutlet", "Spring Roll", "Cold Coffee" };

        System.out.println(
                chatShop[0] + " " + chatShop[1] + " " + chatShop[2] + " " + chatShop[3] + " " + chatShop[4] + " " +
                        chatShop[5] + " " + chatShop[6] + " " + chatShop[7] + " " + chatShop[8] + " " + chatShop[9]);
        for (String chat : chatShop) {
            System.out.println(chat);

        }
    }
}
