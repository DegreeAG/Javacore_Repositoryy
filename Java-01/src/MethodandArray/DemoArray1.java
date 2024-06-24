package MethodandArray;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray1 {
    public static void main(String[] args) {
        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));
        int sum = sumArray(myArray);
        System.out.println("Tổng: " + sum  );
        System.out.println("Trung bình cộng: " + (float) sum / myArray.length);
    }

    public static int sumArray (int[] myArray) {
        int S = 0;
        for (int i = 0; i < myArray.length; i++) {
            S += myArray[i];
        }
        return S;
    }
    public static int[] inputArray () {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] myArray = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử " + i + ": ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }

}
