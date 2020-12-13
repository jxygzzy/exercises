package 完成学生及教师的设计_包括集合;

import java.util.Iterator;
import java.util.List;

public class MyTool {
    public static void separateStu_T(List persons, List teachers, List students) {
        Iterator<Person> iter = persons.iterator();
        while (iter.hasNext()) {
            Person te = iter.next();
            if (te instanceof Student) {
                students.add(te);
            }
            if (te instanceof Teacher) {
                teachers.add(te);
            }
        }
    }
}
