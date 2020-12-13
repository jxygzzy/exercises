package JAVA成绩比较;

public class Student implements Comparable{
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {

        return this.score-student.score;
    }
}
