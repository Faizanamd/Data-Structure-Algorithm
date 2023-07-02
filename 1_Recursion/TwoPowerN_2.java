import java.io.PipedWriter;
import java.util.Scanner;

public class TwoPowerN_2 {
    public static int powerFun(int n ){
        if(n == 0)
            return 1;
        
        int smallAns = powerFun(n-1);
        int ans =  2 * smallAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powerFun(n));
    }
    
}
