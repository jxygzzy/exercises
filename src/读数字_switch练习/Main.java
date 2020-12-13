package 读数字_switch练习;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num=in.nextInt();
            switch (num){
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;
                case 9:
                    System.out.print("jiu");
                    break;
                case 0:
                    System.out.print("ling");
                    break;
            }
            if(i!=n-1){
                System.out.print(" ");
            }
        }
    }
}
