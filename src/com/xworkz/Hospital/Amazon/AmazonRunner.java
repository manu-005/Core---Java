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

         Product product3 = new Product();
        product3.setId(103);
        product3.setName("Shirt");
        product3.setCatagory("Fashion");
        product3.setPrice(499.00);

        Product product4 = new Product();
        product4.setId(104);
        product4.setName("Ceaners");
        product4.setCatagory("Home Appliances");
        product4.setPrice(399.00);

        Product product5 = new Product();
        product5.setId(105);
        product5.setName("Jeans");
        product5.setCatagory("Fashion");
        product5.setPrice(999.00);

        Amazon app = new Amazon();
        app.addProduct(product1);
        app.addProduct(product2);
        app.addProduct(product3);
        app.addProduct(product4);
        app.addProduct(product5);

        app.getProduct();

    }
}
