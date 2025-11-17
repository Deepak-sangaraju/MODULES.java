import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Input citizenship (true/false)
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = sc.nextBoolean();

        // Check eligibility
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        sc.close();
    }
}
