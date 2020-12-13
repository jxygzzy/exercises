package 中国生肖年;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String str = "鼠牛虎兔龙蛇马羊猴鸡狗猪";
        int index = (year - 2020) % 12 >= 0 ? (year - 2020) % 12 : 12 + (year - 2020) % 12;
        System.out.println(str.charAt(index));
    }
}
