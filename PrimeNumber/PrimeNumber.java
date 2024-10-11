package GenerationPracticeQuestions.PrimeNumber;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        // Initialize the flag as true (assuming the number is prime)
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // Set flag to false if divisible, meaning not prime
                    isPrime = false;
                    break; // Exit the loop early
                }
            }
        }

        // Output the result based on the flag
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner object
        scanner.close();
    }
}
    

