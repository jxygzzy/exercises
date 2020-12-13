package 设计MyInteger类;


public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
        this.value = 0;
    }

    public boolean isEven() {
        if (this.value % 2 == 0)
            return true;
        return false;
    }

    public boolean isOdd() {
        if (this.value % 2 != 0)
            return true;
        return false;
    }

    public boolean isPrime() {
        if (value < 2)
            return false;
        for (int i = 2; i < value ; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public boolean equals(int x) {
        return this.value == x;
    }


    public boolean equals(MyInteger x) {

        return value == x.value;
    }

}

