package MyHomeWork2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số nguyên tố đầu tiên cần liệt kê: ");
        int n = new Scanner(System.in).nextInt();
        if (n<=0){
            System.out.println("Vui lòng nhập số tự nhiên lớn hơn 0: ");
        }
        int S = 0;
        int soNguyenTo = 2;
        System.out.println(n + " số nguyên tố đầu tiên là: ");
        while (S < n) {
            boolean primeNumber = true;
            if (soNguyenTo <=1) {
                primeNumber = false;
            }   else {
                for (int i = 2; i < Math.sqrt(soNguyenTo); i++) {
                    if (soNguyenTo % i ==0) {
                        primeNumber = false;
                        break;
                    }

                }
            }
            if (primeNumber ) {
                System.out.println(soNguyenTo + "");
                S++;
            }
            soNguyenTo++;
        }
    }
}
