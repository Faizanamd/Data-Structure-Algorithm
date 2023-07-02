import java.util.Scanner;

public class PowerFunction {

    public static int powerFunction(int a, int b) {
        // a power b format
        if (a == 0 || a == 1)
            return a;
        if (b == 0)
            return 1;

        return a * powerFunction(a, b - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int a = 2, b = 3;
        System.out.println(powerFunction(a, b));

    }

}
