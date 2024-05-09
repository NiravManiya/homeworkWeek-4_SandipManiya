package homework_week_8;

public class Programme14_DiamondPattern {
    public static void main(String[] args) {
        printDiamond(7);
    }

    // Method to print the diamond pattern
    public static void printDiamond(int n) {
        int i = 1;
        while (i <= n) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i >= 1) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
            i--;
        }
    }

    // Method to print spaces
    public static void printSpaces(int spaces) {
        int i = 1;
        while (i <= spaces) {
            System.out.print(" ");
            i++;
        }
    }

    // Method to print stars
    public static void printStars(int stars) {
        int i = 1;
        while (i <= stars) {
            System.out.print("*");
            i++;
        }
    }
}
