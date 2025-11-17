class Rectangle {

    private int length;
    private int breadth;

    // Default constructor (initializes length = 4, breadth = 5)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Parameterized constructor (custom values)
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + getArea());
    }
}

public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Using Default Constructor:");
        r1.display();

        System.out.println();

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println("Using Parameterized Constructor:");
        r2.display();
    }
}
