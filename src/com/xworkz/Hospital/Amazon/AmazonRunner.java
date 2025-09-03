package com.xworkz.Hospital.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product1= new Product();
        product1.setId(101);
        product1.setName("HeadPhone");
        product1.setCatagory("Electronics");
        product1.setPrice(499.00);

        Product product2 = new Product();
        product2.setId(102);
        product2.setName("Mobile");
        product2.setCatagory("Phones");
        product2.setPrice(18999.00);

        Amazon app = new Amazon();
        app.addProduct(product1);
        app.addProduct(product2);

        app.getProduct();

    }
}
