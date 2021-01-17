package 日历类;

public class MyDate {
    public int year;
    public int month;

    MyDate(int a, int b) {
        this.year = a;
        this.month = b;
    }

    public boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int getMonthDay() {
        int a[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int b[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear()) {
            return a[this.month - 1];
        } else {
            return b[this.month - 1];
        }
    }

    public String getStartDay() {
        int a[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int b[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String m[] = {"Wed", "Thu", "Fri", "Sat", "Sun", "Mon", "Tue"};
        int sum = 0, temp;
        int n = this.year;
        for (int i = 1800; i <= n; i++) {
            this.year = i;
            if (i < n) {
                if (isLeapYear()) {
                    sum = sum + 366;
                } else {
                    sum = sum + 365;
                }
            }
            if (i == n) {
                for (int j = 0; j < this.month - 1; j++) {
                    if (isLeapYear()) {
                        sum = sum + a[j];
                    } else {
                        sum = sum + b[j];
                    }
                }
            }
        }


        temp = sum % 7;
        return m[temp];

    }
}
