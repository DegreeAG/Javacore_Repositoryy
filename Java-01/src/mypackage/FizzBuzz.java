package mypackage;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i % 3 ==0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------------");
        Scanner soNguyen = new Scanner(System.in);
        int n = soNguyen.nextInt();
        int S = 0;
        for (int i = 1  ; i <= n; i +=2) {
            if (i %2==0) {
                S +=i;
                System.out.println("Kết quả: " + i);
            }


        }
    }

}
