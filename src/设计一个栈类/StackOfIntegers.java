package 设计一个栈类;

public class StackOfIntegers {
    int data[];
    int size;
    int length;

    public StackOfIntegers() {
        data = new int[16];
        size = 16;
        length = 0;
    }

    public StackOfIntegers(int l) {
        data = new int[l];
        size = l;
        length = 0;
    }

    public void push(int e) {
        data[length++] = e;
    }

    public int getsize() {
        return size;
    }

    public int peek() {
//        System.out.println("元素个数:"+length+"\n元素："+data[length-1]);
        return data[length - 1];
    }

    public boolean empty() {
        return length == 0;
    }

    public int pop() {
        return data[--length];
    }
}
