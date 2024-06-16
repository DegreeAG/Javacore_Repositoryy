package MyHomework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính của hình tròn");
        Scanner bkht = new Scanner(System.in);
        int r = bkht.nextInt();
        float cvht = (float) (r * (Math.PI * 2));
        System.out.println("Chu vi hình tròn là " + cvht);
        float dtht = (float) (r * r * Math.PI);
        System.out.println("Diện tích hình tròn là " + dtht);
    }
}

