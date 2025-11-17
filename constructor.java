class Cylinder {

    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate Volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate Surface Area
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class Main {
    public static void main(String[] args) {

        // Using constructor to set radius and height
        Cylinder c = new Cylinder(5.0, 10.0);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        System.out.println("Volume of Cylinder: " + c.getVolume());
        System.out.println("Surface Area of Cylinder: " + c.getSurfaceArea());
    }
}
