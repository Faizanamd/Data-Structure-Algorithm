public class InsertionSortRecursive {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, int i, int n) {

        if (i >= n)
            return;

        int key = arr[i];
        int j = i;
        while (j > 0 && arr[j - 1] > key) {
            arr[j] = arr[j - 1];
            j--;
        }

        arr[j] = key;

        sort(arr, i + 1, n);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 0, 9, 3 };
        sort(arr, 0, arr.length);
        print(arr);

    }

}
