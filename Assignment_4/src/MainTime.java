class Time {
    int hour, minute, second;

    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    Time addTime(Time t) {
        int s = this.second + t.second;
        int m = this.minute + t.minute + s/60;
        int h = this.hour + t.hour + m/60;

        s %= 60;
        m %= 60;

        return new Time(h, m, s);
    }
}
public class MainTime {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 55);
        Time t2 = new Time(1, 30, 30);

        Time sum = t1.addTime(t2);
        sum.displayTime();
    }
}


