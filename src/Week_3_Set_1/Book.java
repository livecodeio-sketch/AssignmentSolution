package Week_3_Set_1;

class Book {
    private String title;
    private String author;
    private double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "John Doe", 499.99);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
