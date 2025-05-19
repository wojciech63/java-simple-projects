package simpleprojects.src.oop.aggregationPractice;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("The library '" + name + "' has " + books.length + " books.");
        System.out.println("Books avaliable: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

}
