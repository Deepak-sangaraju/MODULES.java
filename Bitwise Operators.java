import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        // Display binary results
        System.out.println("\nBinary of " + a + " = " + Integer.toBinaryString(a));
        System.out.println("Binary of " + b + " = " + Integer.toBinaryString(b));

        System.out.println("\nBitwise AND (a & b) = " + andResult + 
                           " (Binary: " + Integer.toBinaryString(andResult) + ")");

        System.out.println("Bitwise OR  (a | b) = " + orResult + 
                           " (Binary: " + Integer.toBinaryString(orResult) + ")");

        System.out.println("Bitwise XOR (a ^ b) = " + xorResult + 
                           " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        sc.close();
    }
}
