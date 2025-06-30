class Hotel {
    public static void main(String[] args) {
        String hotel_Menu[] = { "chilli chicken", "Chikken Tikka", "Mushroom Dry", "Chicken Biriyani", "Veg Biriyani",
                "Mutton Kabab", "Chikken kabab", "Lolipop", "Egg biriyani", "Ghee Rice", "Paneer Dry", "Cripsy Corn",
                "Baby Corn Tikka", "Gobi Munchurian", "Veg Munchorian", "Paneer Munchurian", "Chikken Masala",
                "pneer Butter Masala", "Dal Makhani", "Chickenkorma", "Chicken Hydrabadi", "Chicken Kolhapuri",
                "Fish fry", "Fish Thali", "Fish Kabab" };
        System.out.println(hotel_Menu[0] + "" + hotel_Menu[1] + "" + hotel_Menu[2] + "" + hotel_Menu[3] + ""
                + hotel_Menu[4] + "" + hotel_Menu[5] + "" + hotel_Menu[6] + "" + hotel_Menu[7] + "" + hotel_Menu[8] + ""
                + hotel_Menu[9] + "" + hotel_Menu[10] + "" + hotel_Menu[11] + "" + hotel_Menu[12] + "" + hotel_Menu[13]
                + "" + hotel_Menu[14] + "" + hotel_Menu[15]);
        for (String hot : hotel_Menu) {
            System.out.println(hot);
        }
    }
}