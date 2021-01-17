package 综艺节目打分计算问题hebust;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int[] ans = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            ans[i] = Integer.parseInt(data[i]);
        }
        Arrays.sort(ans);
        int sum = 0;
        for (int i = 1; i < ans.length - 1; i++) {
            sum += ans[i];
        }
        System.out.println(sum/(ans.length-2));
    }
}
