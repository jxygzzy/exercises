package BMI计算;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        double BMI = w * 0.45359237 / Math.pow((h * 0.0254), 2);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
