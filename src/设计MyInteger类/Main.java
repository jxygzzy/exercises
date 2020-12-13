package 设计MyInteger类;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        MyInteger A = new MyInteger(x);
        MyInteger B = new MyInteger(y);
        MyInteger C = new MyInteger();
        System.out.println(A.isEven());
        System.out.println(A.isOdd());
        System.out.println(A.isPrime());
        System.out.println(A.equals(z));
        System.out.println(A.equals(B));
    }

}

/* 请在这里填写答案 */
