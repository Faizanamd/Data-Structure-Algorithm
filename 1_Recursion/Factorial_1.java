import java.util.Scanner;

class Factorial_1{
    public static int factorial(int n )
    {
        // Base Case
        
        if(n == 0)  return 1;

        int smallAns = factorial(n-1);
        int ans  = n* smallAns;
        return ans;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(factorial(n));
            // sc.close();
        }
    }
    
}