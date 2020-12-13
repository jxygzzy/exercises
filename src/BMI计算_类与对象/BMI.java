package BMI计算_类与对象;

public class BMI {
    String name;
    int age;
    double weight;
    double height;


    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getBMI() {
        return String.format("%.2f",weight * 0.45359237 / Math.pow((height * 0.0254), 2));
    }

    public String getStatus() {
        double Bmi = Double.parseDouble(getBMI());
        if (Bmi < 18.5) {
            return "Underweight";
        } else if (Bmi < 25.0) {
            return "Normal";
        } else if (Bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
