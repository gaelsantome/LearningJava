package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010/01/02");
        Book book = new Book("The Martian Chronicles", "1958-05-04", "97884450", "Ray Bradbury");
        System.out.println(item.getDetails());
        System.out.println(book.getDetails());
    }
}
