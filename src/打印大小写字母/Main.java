package 打印大小写字母;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int N,n;
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        n=input.nextInt();
        input.close();
        InterfaceA a =new Print();
        a.setN(N);
        a.printCapitalLetter();
        InterfaceB b=new Print();
        b.printLowercaseLetter(n);
    }
}

interface InterfaceA {
    void setN(int n);
    void printCapitalLetter();

}
interface InterfaceB {
    void printLowercaseLetter(int n);
}
/* 请在这里填写答案 */