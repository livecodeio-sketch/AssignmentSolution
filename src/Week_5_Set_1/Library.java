package Week_5_Set_1;

import java.util.*;

public class Library {

    // Inner class
    class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayBookDetails() {
            System.out.println("\nTitle: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
        }
    }

    private List<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume newline

        Book book = new Book(title, author, price);
        books.add(book);
        System.out.println("Book added successfully!");
        book.displayBookDetails();
    }

    public void displayAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book b : books) {
            b.displayBookDetails();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> lib.addBook();
                case 2 -> lib.displayAllBooks();
                case 3 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
