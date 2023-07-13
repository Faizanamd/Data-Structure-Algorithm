public class QuickSort {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei)
            return;

        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);

    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[si];
        int i = si;
        int j = ei;

        while (i < j) {
            while (i <= ei && arr[i] <= pivot) {
                i++;
            }
            while (j >= si && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        int pivotIndex = j;
        swap(arr, si, pivotIndex);

        return pivotIndex;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 9 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

}
