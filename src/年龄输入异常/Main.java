package 年龄输入异常;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        People wang = new People();
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        try {
            wang.setAge(n);
            System.out.println(wang.getAge());
        } catch (IntegerException e) {
            System.out.println(e.toString());
        }

    }
}

