public class Juice {
    public static void main(String[] ar) {
        String juiceShop[] = { "Butter Fruit", "Apple", "Banana", "PineApple", "WaterMElon", "MuskMelon", "Lime",
                "Grapes", "BlueBerry", "Carrot", "Tomato", "Orange", "Mango", "Pear", "Pomegranate", "Sweet Lime",
                "Cherry" };
        System.out.println(juiceShop[0] + " " + juiceShop[1] + " " + juiceShop[2] + " " + juiceShop[3] + " "
                + juiceShop[4] + " " + juiceShop[5] + " " + juiceShop[6] + " " + juiceShop[7] + " " + juiceShop[8] + " "
                + juiceShop[9] + " " + juiceShop[10] + " " + juiceShop[11] + " " + juiceShop[12] + " " + juiceShop[13]
                + " " + juiceShop[14] + " " + juiceShop[15] + " " + juiceShop[16]);

        for (String juice : juiceShop) {
            System.out.println(juice);
        }
    }

}
