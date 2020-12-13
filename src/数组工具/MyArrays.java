package 数组工具;

import java.util.Arrays;

public class MyArrays {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static int sumOfArray(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
