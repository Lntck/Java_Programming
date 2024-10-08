package week_07.TimeCreator;

public class TimeCreator {
    public Time TimeCreator(int hour) {
        return new Time(hour);
    }
    public Time TimeCreator(int hour, int minute) {
        return new Time(hour, minute);
    }
    public Time TimeCreator(int hour, int minute, int second) {
        return new Time(hour, minute, second);
    }
}
