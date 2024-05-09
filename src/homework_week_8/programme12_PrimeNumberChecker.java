package homework_week_8;

import java.util.Scanner;

public class programme12_PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        // Check if the number is divisible by any number from 2 to its square root
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If not divisible by any number other than 1 and itself, it's prime
    }
}
