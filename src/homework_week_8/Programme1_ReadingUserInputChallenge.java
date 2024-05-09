package homework_week_8;

import java.util.Scanner;

public class Programme1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.next();
            }
        }

        System.out.println("Sum of the numbers entered: " + sum);
        scanner.close();
    }
}
