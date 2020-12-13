package 约瑟夫环_集合;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        LinkedList<Integer> list = new LinkedList<Integer>();
        /* 请在这里填写答案 */
        for (int i = 1; i <= a; i++) {
            list.add(i);
        }
        
        int now = 0;
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                now++;
                if (now == b) {
                    int temp = list.get(i);
                    list.remove(i);
                    now = 1;
                    if (i == list.size()) {
                        now = 0;
                    }
                    System.out.print(temp + " ");
                }
            }
        }

        System.out.println(list.getFirst());
    }
}

