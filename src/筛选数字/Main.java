package 筛选数字;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        /* 请在这里填写答案 */
        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            if (temp == 0) isEnd = true;
            if (!isEnd && !list.contains(temp)) {
                list.add(temp);
            }
        }


        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

}
