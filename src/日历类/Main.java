package 日历类;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();

        MyDate a = new MyDate(year, month);

        System.out.println(a.isLeapYear());
        System.out.println(a.getMonthDay());
        System.out.println(a.getStartDay());
    }

}

/* 请在这里填写答案 */