package 完成学生及教师的设计_包括集合;

public class Student extends Person {
    int sno;
    String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Student(int sno, String name, String gender, int age, String major) {
        super(name, gender, age);
        this.sno = sno;
        this.major = major;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return student.sno - this.sno;
    }
}
