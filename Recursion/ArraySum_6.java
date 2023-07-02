public class ArraySum_6 {
    public static int getSum(int[] arr,int index){
        if(index == arr.length-1)
            return arr[index];

        return arr[index] + getSum(arr, index+1);
        
    }
    public static void main(String[] args) {
        
        int[] arr ={1, 3,4};
        System.out.println(getSum(arr, 0));
    }
}
