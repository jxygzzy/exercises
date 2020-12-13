package 多线程累加;

public class Thread_test extends Thread
{
    int number;
    public static int sum;
    public Thread_test(int n) //构造函数
    {
        number=n;
    }
    public static synchronized void add(int num){  //同步方法
        sum += num;
    }
    public void run()
    {
        int count=0;
        for(int i=0;i<10;i++)
        {
            count+=number+i;
        }
        System.out.println("The "+((int)number/10+1)+" time: "+count);
        add(count);
    }

}

/* 请在这里填写答案 */