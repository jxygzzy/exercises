package 打印大小写字母;

public class Print implements InterfaceA,InterfaceB{
    int N;
    @Override
    public void setN(int n) {
        this.N=n;
    }

    @Override
    public void printCapitalLetter() {
        int n=N%26;
        if(N%26==0&&N!=0) n=26;
        for (int i = 0; i < n; i++) {
            System.out.printf("%c",('A'+i));
        }
        System.out.println();
    }

    @Override
    public void printLowercaseLetter(int n) {
        if(n%26==0&&n!=0) n=26;
        else n=n%26;
        for (int i = 0; i < n; i++) {
            System.out.printf("%c",('a'+i));
        }
        System.out.println();
    }
}
