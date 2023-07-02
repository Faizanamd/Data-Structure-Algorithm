public class IsSorted_5 {
    public static boolean isSorted(int[] arr, int index, int size) {
        if (size == 0 || size == 1)
            return true;

        if (arr[index] > arr[index + 1])
            return false;
        return isSorted(arr, index + 1, size - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5 };
        boolean ans = isSorted(arr, 0, arr.length);
        if (ans)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

}
