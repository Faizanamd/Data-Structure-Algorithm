
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        divide(arr, si, ei);
    }

    private static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }

    private static void conquer(int[] arr, int si, int mid, int ei) {

        int i = si;
        int j = mid + 1;

        int[] temp = new int[ei - si + 1];
        int x = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j])
                temp[x++] = arr[j++];
            else
                temp[x++] = arr[i++];
        }

        while (i <= mid) {
            temp[x++] = arr[i++];
        }
        while (j <= ei) {
            temp[x++] = arr[j++];
        }
        int k = si;
        for (int s = 0; s < x; s++) {
            arr[k++] = temp[s];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1, 11, 9, 3 };
        mergeSort(arr);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
