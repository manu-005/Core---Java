package com.xworkz.Hospital.ShoppingMall;

public class ShoppingMall {
    int index;

    Shop[] shops = new Shop[2];

    public void addShop(Shop shop){

        if(shop != null){
            shops[index] = shop;
            index++;
        }else{
            System.out.println("Invalid Shop");
        }
    }

    public void getShopDetails(){
        System.out.println("Shop Details ");

        for (Shop s :shops ){
            System.out.println("Id = "+s.getId());
            System.out.println("Name = "+s.getName());
            System.out.println("Catagory = "+s.getCatagory());
            System.out.println("Floor = "+s.getFloor());
            System.out.println("Is Open = "+s.isOpen());
            System.out.println("--------------------------");
        }
    }
}
