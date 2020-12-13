package 鸡兔同笼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        int head, foot;
        Scanner in = new Scanner(System.in);
        head = in.nextInt();
        foot = in.nextInt();
        if (foot % 2 != 0) {
            System.out.println("No Answer");
            return;
        }
        y = (foot - head * 2) / 2;
        x = head - y;
        if (x >= 0 && y >= 0) {
            System.out.println(x+" "+y);
        }else{
            System.out.println("No Answer");
        }
    }
}
