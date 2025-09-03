package com.xworkz.Hospital.Library;

public class LibraryRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setId(101);
        book1.setName("Past Times ");
        book1.setAuthor("Darshan");
        book1.setPrice(999.00);
        book1.setPublisher("Bharath");

        Book book2 = new Book();
        book2.setId(102);
        book2.setName("Now My Time is Start ");
        book2.setAuthor("Own");
        book2.setPrice(899.00);
        book2.setPublisher("Me");

        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);

        lib.getBookDetails();

    }
}
