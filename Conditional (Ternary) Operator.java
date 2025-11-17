import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Display result
        System.out.println(num + " is " + result);

        sc.close();
    }
}
