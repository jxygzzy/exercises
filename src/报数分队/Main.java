package 报数分队;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[100];
        int[] ints1 = new int[100];
        int[] ints2 = new int[100];
        int index1 = 0;
        int index2 = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ints1[index1++] = ints[i];
            } else {
                ints2[index2++] = ints[i];
            }
        }
        for (int i = 0; i < index1; i++) {
            System.out.print(ints1[i]);
            if (i != index1 - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < index2; i++) {
            System.out.print(ints2[i]);
            if (i != index2 - 1) {
                System.out.print(" ");
            }
        }
    }
}
