public class BinarySearch_8 {
    public static int binarySearch(int[] arr, int ele) {
        return binarSearchHelper(arr, 0, arr.length - 1, ele);
    }

    private static int binarSearchHelper(int[] arr, int si, int ei, int ele) {
        if (si > ei)
            return -1;
        int mid = (si + ei) / 2;

        if (arr[mid] == ele) {
            return mid;
        } else if (arr[mid] > ele) {
            return binarSearchHelper(arr, si , mid-1, ele);
        } else
            return binarSearchHelper(arr, mid+1, ei, ele);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8 };
        int indx = binarySearch(arr, 1);
        System.out.println(indx);
    }

}
