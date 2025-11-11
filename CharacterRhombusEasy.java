import java.util.Scanner;

public class CharacterRhombusEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // forward letters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            // backward letters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // forward letters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            // backward letters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }

        sc.close();
    }
}
