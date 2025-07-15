class Swiggy {
    static String itemName;

    public static double getAmount(String itemName) {
        double price = 0;
        if (itemName == "Chikken Biriyani") {
            price = 180.00;
        } else if (itemName == "Veg Biriyani") {
            price = 160.00;
        } else if (itemName == "Idli") {
            price = 60.00;
        } else if (itemName == "Thair Vade") {
            price = 49.00;
        } else if (itemName == "Vada") {
            price = 80.00;
        } else if (itemName == "Panner Fride rice") {
            price = 110.00;
        } else if (itemName == "Paneer Butter Masala") {
            price = 450.00;
        } else if (itemName == "Butter Naan") {
            price = 300.00;
        } else if (itemName == "Dal Makhani") {
            price = 220.00;
        } else if (itemName == "Roti") {
            price = 120.00;
        } else if (itemName == "Chapati") {
            price = 90.00;
        } else if (itemName == "Aloo Paratha") {
            price = 200.00;
        } else if (itemName == "Gobi Paratha") {
            price = 250.00;
        } else if (itemName == "French fries") {
            price = 249.00;
        } else if (itemName == "Samosa") {
            price = 130.00;
        } else if (itemName == "Pav Bhaji") {
            price =110.00;
        } else if (itemName == "Vada Pav") {
            price = 99.00;
        } else if (itemName == "Chole Bhature") {
            price = 349.00;
        } else if (itemName == "Thali(Veg)") {
            price = 449.00;
        } else if (itemName == "Thali(Non-veg)") {
            price = 499.00;
        } else if (itemName == "Pizza") {
            price = 699.00;
        } else if (itemName == "Burger") {
            price = 349.00;
        } else if (itemName == "Black Forest Cake") {
            price = 800.00;
        } else if (itemName == "Nati Style Biriyani") {
            price = 180.00;
        } else if (itemName == "Pasta") {
            price = 180.00;
        } else if (itemName == "Sushi") {
            price = 149.00;
        } else if (itemName == "Rice Bowl") {
            price = 80.00;
        } else if (itemName == "Kabab") {
            price = 120.00;
        } else if (itemName == "Mutton Biriyani") {
            price = 280.00;
        } else if (itemName == "Benne Dosa") {
            price = 60.00;
        } else if (itemName == "South Meals") {
            price = 160.00;
        } else if (itemName == "Veg Parcel") {
            price = 60.00;
        } else if (itemName == "Momos") {
            price = 100.00;
        } else if (itemName == "Steamed Momos") {
            price = 90.00;
        } else if (itemName == "Ice cream ") {
            price = 120.00;
        } else if (itemName == "MilkShake") {
            price = 119.00;
        } else if (itemName == "Tea/Cofee") {
            price = 49.00;
        } else if (itemName == " Lassi") {
            price = 99.00;
        } else if (itemName == "Soft Drinks") {
            price = 80.00;
        } else {
            System.out.println("Not Valid Country Name ");
        }
        return price;
    }

    public static void main(String[] ar) {

        double amount = getAmount("Roti");
        System.out.println("Price for Selected Food Item is : " + amount);

    }
}