package MyHomework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Giải và biện luận phương trình bậc nhất ax + b = 0");
        Scanner ptbn = new Scanner(System.in);
        System.out.println("Nhập a");
        float a = ptbn.nextFloat();
        System.out.println("Nhập b");
        float b = ptbn.nextFloat();
        if (a != 0) {
            System.out.println("Phương trình có nghiệm duy nhất " + (-b) / a);
        } else { // a==0
            if (b != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm đúng với mọi x");
            }
        }
    }
}
