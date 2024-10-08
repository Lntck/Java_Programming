package week_07.TimeCreator;
import static java.lang.Math.abs;

public class Time {
    int hour = 0, minute = 0, second = 0;
    public Time(int hour) {
        this.hour = hour;
    }
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void TimeValidate(){
        if (this.hour % 24 != 0) {
            this.hour = this.hour % 24;
        }
        if (this.minute % 60 != 0) {
            this.minute = this.minute % 60;
            this.hour++;
        }
        if (this.second % 60 != 0) {
            this.second = this.second % 60;
            this.minute++;
        }
    }

    public Time inc(){
        this.second++;
        TimeValidate();
        return this;
    }

    public int GetTimeInSeconds(){
        return this.second + (this.minute * 60) + (this.hour * 3600);
    }

    public int Difference(Time OtherTime){
        return abs(this.GetTimeInSeconds() - OtherTime.GetTimeInSeconds());
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
