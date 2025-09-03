package com.xworkz.Hospital.ShoppingMall;

public class ShoppingMallRunner {

    public static void main(String[] args) {

        Shop shop1 = new Shop();

        shop1.setId(1);
        shop1.setName("Dominos");
        shop1.setCatagory("food");
        shop1.setOpen(true);
        shop1.setFloor("5th Floor");

        Shop shop2 = new Shop();
        shop2.setId(2);
        shop2.setName("Burger King");
        shop2.setCatagory("food");
        shop2.setOpen(true);
        shop2.setFloor("4th Floor");

        ShoppingMall mall = new ShoppingMall();

        mall.addShop(shop1);
        mall.addShop(shop2);

        mall.getShopDetails();

    }
}
