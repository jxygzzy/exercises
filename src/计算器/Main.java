package 计算器;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int res=0;
        switch (op){
            case "+":res=a+b;break;
            case "-":res=a-b;break;
            case "*":res=a*b;break;
            case "/":res=a/b;break;
        }
        System.out.println(a+" "+op+" "+b+" = "+res);
    }
}
