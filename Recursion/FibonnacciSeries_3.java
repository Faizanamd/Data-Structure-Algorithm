import java.lang.module.FindException;
import java.util.Scanner;

public class FibonnacciSeries_3 {
    public static int fib(int n){
        // Base Case
        if(n == 0 || n == 1)    return n;

        int smallAns1 = fib(n-1);
        int smallAns2 = fib(n-2);
        int ans  = smallAns1 + smallAns1;
        return ans;


    
        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    
}
