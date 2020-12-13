package 按要求编写一个类Car练习类的定义;

import java.util.Scanner;

public class Car {
    String CarNumber;

    @Override
    public String toString() {
        return "My car No. is: "+CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car demoCar =new Car();
        String carNumber=in.nextLine();
        while(carNumber.length()!=5){
            carNumber=in.nextLine();
        }
        demoCar.setCarNumber(carNumber);
        System.out.println(demoCar);
    }
}
