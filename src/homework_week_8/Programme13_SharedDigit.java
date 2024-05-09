package homework_week_8;

public class Programme13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // Should return true
        System.out.println(hasSharedDigit(9, 99));  // Should return false
        System.out.println(hasSharedDigit(15, 55)); // Should return true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if either number is not within the range of 10-99
        if (!isValid(num1) || !isValid(num2)) {
            return false;
        }

        // Extract digits from the numbers
        int digit1Num1 = num1 % 10;
        int digit2Num1 = num1 / 10;
        int digit1Num2 = num2 % 10;
        int digit2Num2 = num2 / 10;

        // Check if any digit from the first number matches any digit from the second number
        return digit1Num1 == digit1Num2 || digit1Num1 == digit2Num2 ||
                digit2Num1 == digit1Num2 || digit2Num1 == digit2Num2;
    }

    // Method to check if a number is within the range of 10-99
    public static boolean isValid(int number) {
        return number >= 10 && number <= 99;
    }
}
