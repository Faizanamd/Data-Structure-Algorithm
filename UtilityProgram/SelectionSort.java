
public class SelectionSort {
    public static void sortArray(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            print(arr);
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmep = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmep;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 0, 9, 3 };
        sortArray(arr, arr.length);
        // for(int i:arr)
        // System.out.print(i+" ");
        // System.out.println();

    }

}
