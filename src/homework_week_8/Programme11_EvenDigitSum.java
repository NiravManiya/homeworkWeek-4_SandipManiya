package homework_week_8;

public class Programme11_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // Should return 20
        System.out.println(getEvenDigitSum(252));      // Should return 4
        System.out.println(getEvenDigitSum(-22));      // Should return -1
    }

    public static int getEvenDigitSum(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        // Extract each digit from the number and check if it's even
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit; // Add the even digit to the sum
            }
            number /= 10; // Move to the next digit
        }
        return sum;
    }
}
