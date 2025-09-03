package com.xworkz.Hospital.Library;

public class Library {

    Book[] books =new Book[2];
int index;

 public void   addBook(Book book){

     if (book != null){
         books[index++] = book;

     }

    }
    public void getBookDetails(){

        System.out.println("Book Details ");

        for(Book b : books){
            System.out.println("Id = "+b.getId());
            System.out.println("Name = "+b.getName());
            System.out.println("Author = "+b.getAuthor());
            System.out.println("Publisher = "+b.getPublisher());
            System.out.println("Price = "+b.getPrice());
            System.out.println("--------------------------------");
        }
    }
}
