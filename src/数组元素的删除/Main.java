package 数组元素的删除;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int index=scanner.nextInt();
            arrayList.remove(index-1);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if(i<arrayList.size()-1){
                System.out.print(" ");
            }
        }
    }
}
