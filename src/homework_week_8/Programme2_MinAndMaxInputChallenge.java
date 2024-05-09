package homework_week_8;

import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstIteration = true;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (firstIteration) {
                    min = number;
                    max = number;
                    firstIteration = false;
                } else {
                    min = Math.min(min, number);
                    max = Math.max(max, number);
                }
            } else {
                System.out.println("Invalid input. Exiting loop.");
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);

        scanner.close();
    }
}
