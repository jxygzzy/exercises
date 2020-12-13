package BMI计算_类与对象;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        double weight = input.nextDouble();
        double height = input.nextDouble();

        BMI bmi1 = new BMI(name, age, weight, height);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

    }

}

/* 请在这里填写答案 */