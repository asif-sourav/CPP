public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {7, -5, 3, 2, 1, 0, 45};
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        // Selection Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Helper method to print array elements
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
