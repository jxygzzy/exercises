package 实现计算班级平均分的功能;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    private String classCode;
    public static Scanner scanner = new Scanner(System.in);

    public List<Student> constructStudentList() {
        classCode = scanner.next();
        List<Student> list = new ArrayList<>();
        while (true) {
            Student student = readInStudent();
            if (student.getName().equals("#")) break;
            list.add(student);
        }
        return list;
    }

    public Student readInStudent() {
        String name = scanner.next();
        if (name.equals("#")) {
            return new Student("#", "#", 0);
        }
        String classCode = scanner.next();
        int score = scanner.nextInt();
        return new Student(name, classCode, score);
    }

    public double computeAverageScore(List<Student> list) {
        double avg = 0;
        int count = 0;
        for (Student student :
                list) {
            if (student.getClassCode() .equals(classCode)) {
                avg += student.getScore();
                count++;
            }
        }
        return avg / count;
    }
}
