package 大数相加;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tempa, tempb;

        Scanner input = new Scanner(System.in);
        tempa = input.nextLine();
        tempb = input.nextLine();

        int c = Math.max(tempa.length(), tempb.length());
        int[] a = new int[c];
        int[] b = new int[c];
        int[] result = new int[c + 1];
        Transform(tempa, tempb, a, b);
        result = BigNumAdd(a, b);

        Display(result,tempa,tempb);


    }

    /* 请在这里填写答案 */
    private static int[] BigNumAdd(int[] a, int[] b) {
        int len = a.length;
        int c[] = new int[len + 1];
        boolean flag = false;//是否进位
        for (int i = len - 1; i >= 0; i--) {
            int sum = a[i] + b[i];
            if (flag) {
                sum++;
            }

            flag = false;
            if (sum > 9) {
                sum = sum % 10;
                flag = true;
            }

            c[i + 1] = sum;
        }
        if (flag) {
            c[0] = 1;
        }
        return c;

    }

    private static void Transform(String tempa, String tempb, int[] a, int[] b) {
        int la = tempa.length();
        int lb = tempb.length();
        if (la < lb) {
            //给a填0,长度为lb-la
            int l = lb - la;
            for (int i = 0; i < l; i++) {
                a[i] = 0;
            }
            //tempa_String转int
            for (int i = 0; i < tempa.length(); i++) {
                a[i + l] = tempa.charAt(i) - '0';
            }
            //tempb_String转Int
            for (int i = 0; i < tempb.length(); i++) {
                b[i] = tempb.charAt(i) - '0';
            }

        } else {
            int l = la - lb;
            for (int i = 0; i < l; i++) {
                b[i] = 0;
            }
            for (int i = 0; i < tempb.length(); i++) {
                b[i + l] = tempb.charAt(i) - '0';
            }
            for (int i = 0; i < tempa.length(); i++) {
                a[i] = tempa.charAt(i) - '0';
            }
        }
    }

    public static void Display(int[] a,String tempa,String tempb) {
        System.out.print(tempa+"+"+tempb+"=");
        if (a[0] != 0) System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}