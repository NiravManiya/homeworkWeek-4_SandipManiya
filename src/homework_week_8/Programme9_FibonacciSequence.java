package homework_week_8;

public class Programme9_FibonacciSequence {
    public static void main(String[] args) {
        int n = 8; // Number of Fibonacci numbers to generate

        // Initialize first two Fibonacci numbers
        int a = 1;
        int b = 1;

        System.out.print(a + " " + b + " "); // Print the first two numbers

        // Generate the next Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
