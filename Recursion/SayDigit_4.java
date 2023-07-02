import java.util.Scanner;

import javax.print.MultiDocPrintJob;

public class SayDigit_4 {
    public static void sayDigit(int n)
    {
        if(n == 0){
            return;
        }
        
        int mod  = n %10;
        sayDigit(n/10);
        if(mod == 1)
            System.out.print(" one ");
        else if(mod == 2)
            System.out.print(" Two ");
        else if(mod == 3)
            System.out.print(" Three ");
        else if(mod == 4)
            System.out.print(" Four ");
        else if(mod == 5)
            System.out.print(" Five ");
        else if(mod == 6)
            System.out.print(" Six ");
        else if(mod == 7)
            System.out.print(" Seven ");
        else if(mod == 8)
            System.out.print(" Eight ");
        else if(mod == 9)
            System.out.print(" Nine ");
        else
            System.out.print(" Zero ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sayDigit(n);
    }
    
}
