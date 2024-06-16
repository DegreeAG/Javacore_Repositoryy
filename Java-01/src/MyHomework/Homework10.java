package MyHomework;

import java.util.Scanner;

public class Homework10 {

    public static void main(String[] args) {
//        Scanner st1 = new Scanner(System.in);
//        Scanner st2 = new Scanner(System.in);
//        System.out.println("Nhập vào 1 đoạn văn bản");
//        String something1 = st1.next();
//        System.out.println("Nhập vào 1 kí tự");
//        String something2 = st2.next();
        String something1 = "Bài tập Java - Buổi 2";
        System.out.println(something1);
        String something2 = "a";
        System.out.println(something2);
        System.out.println("vị trí xuất hiện đầu tiên của kí tự a là vị trí thứ :" + (something1.indexOf(something2)));
        System.out.println("vị trí xuất hiện cuối cùng của kí tự a là vị trí thứ :" + (something1.lastIndexOf(something2)));
    }

}
