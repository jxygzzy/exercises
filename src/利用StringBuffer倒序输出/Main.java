package 利用StringBuffer倒序输出;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reorder(str));
    }
    public static String reorder(String str){
        StringBuffer res = new StringBuffer(str);
        return res.reverse().toString();
    }
}
