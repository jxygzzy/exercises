package 实现计算所有工人总工资的功能;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerList {
    public static Scanner scanner=new Scanner(System.in);

    public List<Worker> constructWorkerList() {
        List<Worker> workers =new ArrayList<Worker>();
        int workerNum=scanner.nextInt();
        for (int i = 0; i < workerNum; i++) {
            workers.add(readInWorker());
        }
        return workers;
    }
    public static Worker readInWorker(){
        String name=scanner.next();
        double salary=scanner.nextDouble();
        return new Worker(name,salary);
    }

    public double computeTotalSalary(List<Worker> list) {
        double total=0;
        for (Worker worker :
                list) {
            total += worker.getSalary();
        }
        return total;
    }
}
