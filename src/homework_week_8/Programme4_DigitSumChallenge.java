package homework_week_8;

public class Programme4_DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(125)); // Should print 8
        System.out.println(sumDigits(1));   // Should print -1
        System.out.println(sumDigits(9));   // Should print -1
        System.out.println(sumDigits(-12)); // Should print -1
        System.out.println(sumDigits(0));   // Should print -1
    }

    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {

            sum += number % 10;

            number /= 10;
        }
        return sum;
    }
}
