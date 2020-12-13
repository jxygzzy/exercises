package 实现计算班级平均分的功能;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentList sl=new StudentList();
        List<Student> list=sl.constructStudentList();
        System.out.println(sl.computeAverageScore(list));
    }
}

/* 请在这里填写答案 */
/*请在这里补充Student类*/


/*请在这里补充StudentList类*/