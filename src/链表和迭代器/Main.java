package 链表和迭代器;


import java.util.*;
public class Main{
    public static void main(String args[]){
        LinkedList<String> mylist=new LinkedList<String>();
        mylist.add("Hello");                 //链表中的第一个节点
        mylist.add("PTA");                 //链表中的第二个节点
        mylist.add("I");
        /* 请在这里填写答案 */
        mylist.set(0,"I");
        mylist.set(1,"love");
        mylist.set(2,"java");
        Iterator<String> iter= mylist.iterator();

        while(iter.hasNext()) {
            String te=(String)iter.next();  //必须强制转换取出的数据
            System.out.print(te+" ");
        }
    }
}
