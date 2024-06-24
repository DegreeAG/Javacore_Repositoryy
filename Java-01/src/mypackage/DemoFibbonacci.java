package mypackage;

import java.util.Scanner;

public class DemoFibbonacci {
    public static void main(String[] args) {
        int  n = new Scanner(System.in).nextInt();
        System.out.println("Nhập số n");
        System.out.println(fibonacci(n));
        }
    public static long  fibonacci(int n) {
        if (n ==0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }   else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

