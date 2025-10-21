package Week_4_Set_1;

abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    public Book(String title, String author, double price){
        this.title = title; this.author = author; this.price = price;
    }
    public abstract void printDetails();
}

class TextBook extends Book {
    private String subject;
    public TextBook(String title, String author, double price, String subject){
        super(title, author, price); this.subject = subject;
    }
    @Override
    public void printDetails(){
        System.out.println("TextBook: " + title + ", Author: " + author + ", Price: " + price + ", Subject: " + subject);
    }
}

class Magazine extends Book {
    private int issueNo;
    public Magazine(String title, String author, double price, int issueNo){
        super(title, author, price); this.issueNo = issueNo;
    }
    @Override
    public void printDetails(){
        System.out.println("Magazine: " + title + ", Editor: " + author + ", Price: " + price + ", Issue: #" + issueNo);
    }
}

public class BookDemo {
    public static void main(String[] args){
        Book[] books = {
                new TextBook("Java Fundamentals","A. Author", 450.0, "Programming"),
                new Magazine("Tech Monthly","B. Editor", 120.0, 42)
        };
        for(Book b : books) b.printDetails();
    }
}
