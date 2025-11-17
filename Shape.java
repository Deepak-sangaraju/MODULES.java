import java.util.Scanner;

class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        // Calling methods
        System.out.println("Circle Details:");
        c.displayShape();
        c.area();

        System.out.println("\nRectangle Details:");
        r.displayShape();
        r.area();
    }
}
