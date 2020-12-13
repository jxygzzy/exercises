package JAVA成绩比较;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student p1=new Student("张三", 88);
        String name = input.next();
        int score = input.nextInt();
        Student p2 = new Student(name,score);
        System.out.println(p1.compareTo(p2));
        input.close();
    }

}

/* 请在这里填写答案 */