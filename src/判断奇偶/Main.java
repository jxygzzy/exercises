package 判断奇偶;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x%2==0){
            System.out.println(x+" is even.");
        }else{
            System.out.println(x+" is odd.");
        }

    }
}
