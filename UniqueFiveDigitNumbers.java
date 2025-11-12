public class UniqueFiveDigitNumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("All unique five-digit numbers using 1, 2, 3, 4, 5:\n");

        // Using nested loops for all digit positions
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                for (int c = 1; c <= 5; c++) {
                    for (int d = 1; d <= 5; d++) {
                        for (int e = 1; e <= 5; e++) {
                            // Check all digits are different
                            if (a != b && a != c && a != d && a != e &&
                                b != c && b != d && b != e &&
                                c != d && c != e &&
                                d != e) {
                                System.out.println("" + a + b + c + d + e);
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\nTotal unique 5-digit numbers = " + count);
    }
}
