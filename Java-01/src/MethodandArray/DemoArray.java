package MethodandArray;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {


    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] myArray = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử" + i + ": ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(myArray));
    }
}
