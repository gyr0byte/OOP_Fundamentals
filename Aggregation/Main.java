package Aggregation;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The subtle art of ngf", 247);
        Book b2 = new Book("The power of your subconcious mind", 331);
        Book b3 = new Book("Think and grow rich", 190);

        Book[] books = { b1, b2, b3 };
        Library library = new Library("KTM library", 2001, books);
        library.displayInfo();
    }
}