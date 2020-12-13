package 父子年龄比较2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y,m,d;
        y=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();
        sc.close();
        Age sonage=new Age(2000);
        sonage.setMonth(1);
        sonage.setDay(1);
        Age fatherage=new Age(y,m,d);
        try{System.out.print(sonage.Compare(fatherage));
        }
        catch(AgeException e){
            System.out.println(e.toString());
        }
    }

}
/* 请在这里填写答案 */