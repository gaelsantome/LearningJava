package com.campusdual.classes;

import com.campusdual.Utils;

public class Book {

    private String title;
    public String author;
    public int pageNumber;

    public Book(){
        this.title = Utils.string("Write the book title: ");
        this.author = Utils.string("Write the book author: ");
        this.pageNumber = Utils.integer("Write the number of pages: ");
    }

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author  = author;
        this.pageNumber = numberOfPages;
        
    }

    private void showBookDetails(){
        System.out.println(this.title + " - " + this.author + " (" + this.pageNumber + "pages)") ;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Rythm of War", "Brandon Sanderson", 1902);
        Book b2 = new Book("The Magician's Apprentice", "Trudi Canavan", 781);
        Book b3 = new Book("El Paciente", "Juan Gómez-Jurado", 471);
        Book b4 = new Book();

        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();

    }
}