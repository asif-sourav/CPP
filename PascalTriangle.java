import java.util.Scanner;

public class PascalTriangle {

    // Method to print Pascal's Triangle in normal order
    public static void printNormal(int rows) {
        System.out.println("\nPascal's Triangle (Normal Order):");
        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Method to print Pascal's Triangle in reverse order
    public static void printReverse(int rows) {
        System.out.println("\nPascal's Triangle (Reverse Order):");
        for (int i = rows - 1; i >= 0; i--) {
            // Print spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printNormal(rows);
        printReverse(rows);

        sc.close();
    }
}
