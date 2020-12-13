package 整除判断;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println(a + " is divisible by 2 and 3");
        } else if (a % 2 == 0 || a % 3 == 0) {
            System.out.println(a + " is divisible by 2 or 3, but not both");
        } else {
            System.out.println(a + " is not divisible by 2 and 3");
        }
    }
}
