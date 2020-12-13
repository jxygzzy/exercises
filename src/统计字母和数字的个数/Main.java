package 统计字母和数字的个数;

import java.util.Scanner;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int Case = 0;
        int Digit = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                Digit++;
            }
            if (isLetter(str.charAt(i))) {
                Case++;
            }
        }
        System.out.println(Case+" "+Digit);
    }
}
