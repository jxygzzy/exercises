package 加法器;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = "";
        String b = "";
        String op = "";
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                a += str.charAt(i);
            } else {
                break;
            }
        }

        for (; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                op += str.charAt(i);
            } else {
                break;
            }
        }

        for (; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                b += str.charAt(i);
            } else {
                break;
            }
        }
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);

        int res=0;
        switch (op){
            case "+":res=first+second;break;
            case "-":res=first-second;break;
            case "*":res=first*second;break;
            case "/":res=first/second;break;
        }
        System.out.println(first+" "+op+" "+second+" = "+res);

    }
}

