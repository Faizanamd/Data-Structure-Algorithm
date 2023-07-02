
public class InsertionSort {
     public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, int n){

        for(int i =1   ; i< n; i++){
            int j = i;
            int key = arr[i];
            while(j>0 && arr[j-1] > key){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
                int[] arr = { 4, 5, 2, 0, 9, 3 };
            sort(arr, arr.length);
            print(arr);
    }
    
}
