package homework_week_8;

public class Programme7_SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // Should return 4
        System.out.println(sumFirstAndLastDigit(257)); // Should return 9
        System.out.println(sumFirstAndLastDigit(0));   // Should return 0
        System.out.println(sumFirstAndLastDigit(5));   // Should return 10
        System.out.println(sumFirstAndLastDigit(-10)); // Should return -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        // Extract the last digit
        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = 0;
        while (number != 0) {
            firstDigit = number;
            number /= 10;
        }

        // Add the first and last digits
        return firstDigit + lastDigit;
    }
}
