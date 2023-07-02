public class SelectionSortUsingRecrusing {
    public static void sort(int[] arr, int i, int n) {

        // Base Condition
        if (i == n - 1)
            return;

        // Solve for one step
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        // Recursive Call
        sort(arr, i + 1, n);
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 0, 9, 3 };
        sort(arr, 0, arr.length);
        print(arr);

    }

}
