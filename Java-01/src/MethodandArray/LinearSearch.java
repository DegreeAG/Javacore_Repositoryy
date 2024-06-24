package MethodandArray;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] mang = inputArray();
        System.out.println("Nhập số nguyên x:");
        int x = new Scanner(System.in).nextInt();
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                System.out.println("Tìm thấy số nguyên " + x + " trong mảng tại vị trí " + i);
                break;
            }
        }
        System.out.println("Không tìm thấy");
    }


    public static int[] inputArray() {
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
