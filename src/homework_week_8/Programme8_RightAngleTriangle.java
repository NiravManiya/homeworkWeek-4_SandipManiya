package homework_week_8;

public class Programme8_RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            printRow(i); // Call method to print each row
            System.out.println(); // Move to the next line for the next row
        }
    }

    // Method to print each row of the triangle
    public static void printRow(int rowNum) {
        // Loop to print "@" symbols for the current row
        for (int j = 1; j <= rowNum; j++) {
            System.out.print("@");
        }
    }
}
