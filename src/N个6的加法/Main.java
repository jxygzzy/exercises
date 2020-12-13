package N个6的加法;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 6;
        int cnt = in.nextInt();
        int ans = 0;
        for (int i = 1; i <= cnt; i++) {
            int sum=0;
            for (int j = 1; j <= i; j++) {
                sum=sum*10+num;
            }
//            System.out.println(sum);
            ans+=sum;
        }
        System.out.println(ans);
    }
}
