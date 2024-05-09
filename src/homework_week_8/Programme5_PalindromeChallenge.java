package homework_week_8;

public class Programme5_PalindromeChallenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // Should return true
        System.out.println(isPalindrome(707));   // Should return true
        System.out.println(isPalindrome(11212)); // Should return false
    }

    public static boolean isPalindrome(int number) {
        int reversed = reverse(number);
        return number == reversed;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            originalNumber /= 10;
        }

        return reversedNumber;
    }
}
