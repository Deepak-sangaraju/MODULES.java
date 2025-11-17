class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor (title & author)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;   // default value
    }

    // Parameterized Constructor (all fields)
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}


public class Main {
    public static void main(String[] args) {

        // Using Default Constructor
        Book b1 = new Book();
        b1.display();

        // Using Parameterized Constructor (title & author)
        Book b2 = new Book("Java Programming", "James Gosling");
        b2.display();

        // Using Parameterized Constructor (all fields)
        Book b3 = new Book("Python Basics", "Guido van Rossum", 450.50);
        b3.display();
    }
}
