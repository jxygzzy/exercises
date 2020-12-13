package 随机数100;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = CreateRandom();
        System.out.println("随机数为：");
        PrintArr(arr);

        MySort(arr);
        System.out.println("\n排序后为：");
        PrintArr(arr);

        System.out.println("\n最大数为：" + FindMax(arr));

    }

    public static int[] CreateRandom() {
        int[] arr = new int[100];
        Random rm = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = rm.nextInt(100) + 1;
        }
        return arr;
    }

    public static void MySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static int FindMax(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
            if (i != 0 && (i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}
