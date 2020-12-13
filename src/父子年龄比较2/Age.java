package 父子年龄比较2;

public class Age {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Age(int year) {
        this.year = year;
    }

    public Age(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int Compare(Age fatherage) throws AgeException {
        int subAge = this.year - fatherage.getYear();
        if (this.month < fatherage.getMonth()) subAge--;
        else if (fatherage.getMonth() == this.month && fatherage.getDay() < this.day) subAge--;
        if (subAge > 70) {
            throw new AgeException("too old");
        } else if (subAge < 20) {
            throw new AgeException("too young");
        } else {
            return subAge;
        }
    }
}
