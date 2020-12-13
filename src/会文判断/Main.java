package 会文判断;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < temp.length(); i++) {
            if(Character.isLetterOrDigit(temp.charAt(i))){
                str.append(temp.charAt(i));
            }
        }
        int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== str.charAt(str.length()-1-i)){
                cnt++;
            }
        }
        System.out.println(cnt==str.length());
    }
}
