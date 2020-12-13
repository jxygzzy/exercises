package 输入单词倒置;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans=in.nextLine();
        String []out=ans.split(" ");
        for (int i = out.length-1; i >0 ; i--) {
            System.out.print(out[i]+" ");
        }
        System.out.print(out[0]);
    }
}
