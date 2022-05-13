package com.javapracticeshiv.project;
class Library{
    String[] books;
    int numberOfBooks;

    Library(){
        this.books = new String[100];
        this.numberOfBooks = 0;
    }
    void addBook(String book){
        this.books[numberOfBooks] = book;
        numberOfBooks++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for (String book:this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for (int i =0; i < this.books.length; i++){
            if(this.books[i].equals(book)){
            System.out.println("The book has been issued");
            this.books[i] = null;
            return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book );
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("21 Lesson for 21st Century");
        centralLibrary.addBook("Sea Prayer");
        centralLibrary.addBook("Kite Runner");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Sea Prayer");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Sea Prayer");
        centralLibrary.showAvailableBooks();



    }

}
