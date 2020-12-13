package 实现计算所有工人总工资的功能;

public class Worker {
    private String name;
    private double salary;

    public Worker() { }

    public Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString() {
        return name + " "+salary;
    }
}