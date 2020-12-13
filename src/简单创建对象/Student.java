package 简单创建对象;

public class Student {
    private String Name;
    private int ID;

    public Student(String name, int ID) {
        Name = name;
        this.ID = ID;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return Name + ' '+ ID ;
    }
}
