public class LinearSearch_7 {
    public static boolean isPresent(int[] arr, int ele, int index){
        if(index == arr.length-1)
            return false;
        if(arr[index] == ele)   return true;
        return isPresent(arr, ele, index+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 0, 1};
        System.out.println(isPresent(arr, 1, 0));
    }
}
