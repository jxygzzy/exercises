package 实现计算班级平均分的功能;

public class Student {
    private String name;
    private String classCode;
    private int score;

    public Student(String name, String classCode, int score) {
        this.name = name;
        this.classCode = classCode;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
