package 实现计算所有工人总工资的功能;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkerList app=new WorkerList();
        List<Worker> list=app.constructWorkerList();
        System.out.println(app.computeTotalSalary(list));
    }
}