package 完成学生及教师的设计_包括集合;

public class Teacher extends Person {
    int tno;
    String subject;

    public Teacher(int tno, String name, String gender, int age, String subject) {
        super(name, gender, age);
        this.tno = tno;
        this.subject = subject;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int compareTo(Object o) {
        Teacher teacher = (Teacher) o;
        return this.getAge()-teacher.getAge();
    }
}
