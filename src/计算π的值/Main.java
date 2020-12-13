package 计算π的值;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pi = 0;
        double flag = 1;
        for (int i = 1; i <= n; i++) {
            pi += flag / ((i * 2) - 1);
            flag *= -1;
        }
        pi *= 4;
        System.out.println(pi);
    }

}
