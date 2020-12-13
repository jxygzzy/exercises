package 父子年龄比较;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y,m,d;
        y=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();
        sc.close();
        Age father=new Age(1980);
        father.setMonth(2);
        father.setDay(18);
        Age son=new Age(y,m,d);
        try{System.out.print(father.Compare(son));
        }
        catch(AgeException e){
            System.out.println(e.toString());
        }
    }

}
/* 请在这里填写答案 */