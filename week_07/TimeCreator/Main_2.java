package week_07.TimeCreator;

public class Main_2 {
    public static void main(String[] args) {
        TimeCreator tc = new TimeCreator();
        Time time1 = tc.TimeCreator(13,55,30);
        Time time2 = tc.TimeCreator(16,25,20);

        System.out.println(time1.toString());
        time1.inc().inc().inc();
        System.out.println(time1.toString());

        System.out.println(time2.Difference(time1));
    }
}
