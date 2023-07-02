public class BubbleSortUsingRecursion {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // First method using two method
    public static void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            sortHelper(arr, n, 0, 0);
            print(arr);
        }

    }

    private static void sortHelper(int[] arr, int n, int i, int j) {

        if (i >= n - 1)
            return;

        if (j == n - i)
            sortHelper(arr, n, i + 1, j);

        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
        sortHelper(arr, n, i, j + 1);
    }

    // Usuing single method
    public static void sortArray(int[] arr, int n) {
        if (n == 0 || n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sortArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 0, 9, 3 };

        // sort(arr, arr.length);
        sortArray(arr, arr.length);
        print(arr);

    }

}
