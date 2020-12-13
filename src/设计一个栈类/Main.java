package 设计一个栈类;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int first = input.nextInt();
        input.close();

        StackOfIntegers stack1 = new StackOfIntegers();
        StackOfIntegers stack = new StackOfIntegers(l);

        stack1.push(first);


        System.out.println(stack1.getsize() + " " + stack1.peek());

        for (
                int i = 0;
                i < l; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

}

/* 请在这里填写答案 */