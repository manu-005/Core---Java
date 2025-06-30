class Ice {
    public static void main(String[] ar) {
        String superMarket_IceCrems[] = { "Venilla", "chocolate", "Chocolate Chip", "Strawberry", "Cookies", "Mint",
                "Butter Pecan", "Rockey road", "Cofee", "Mango" };

        System.out.println(superMarket_IceCrems[0] + " " + superMarket_IceCrems[1] + " " + superMarket_IceCrems[2] + " "
                + superMarket_IceCrems[3] + " " + superMarket_IceCrems[4] + " " + superMarket_IceCrems[5] + " "
                + superMarket_IceCrems[6] + " " + superMarket_IceCrems[7] + " " + superMarket_IceCrems[8]);
        for (String i : superMarket_IceCrems) {
            System.err.println(i);
        }
    }
}