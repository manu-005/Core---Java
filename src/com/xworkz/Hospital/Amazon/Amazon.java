package com.xworkz.Hospital.Amazon;

public class Amazon {

    Product[] products = new Product[2];
    int index;

    public boolean addProduct(Product product) {
        boolean aded = false;

        if (products != null) {
            products[index++] = product;
            aded = true;
        }

        return aded;
    }

    public void getProduct() {
        System.out.println("Product Details ");

        for (Product var : products) {
            System.out.println("Id = " + var.getId());
            System.out.println("Name = " + var.getName());
            System.out.println("Catagory = " + var.getCatagory());
            System.out.println("Price = " + var.getPrice());
            System.out.println("--------------------------------");

        }

    }

}
