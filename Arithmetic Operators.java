import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Calculations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;       // assumes b != 0
        int remainder = a % b;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}

