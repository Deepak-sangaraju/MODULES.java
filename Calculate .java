class Cylinder {

    private double radius;
    private double height;

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
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

        Cylinder c = new Cylinder();

        // Q1: Setting radius and height using setters
        c.setRadius(5.0);
        c.setHeight(10.0);

        // Printing calculated values
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        System.out.println("Volume of Cylinder: " + c.getVolume());
        System.out.println("Surface Area of Cylinder: " + c.getSurfaceArea());
    }
}
