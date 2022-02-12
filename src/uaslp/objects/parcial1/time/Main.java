package uaslp.objects.parcial1.time;

public class Main {

    public static void main(String[] args) {
	Time time = new Time(9, 45, 10);
    System.out.println(time.toString());

    System.out.println("");

    time.addSecond(300);
    System.out.println(time.toString());

    System.out.println("");

    time.addMinute(-55);
    System.out.println(time.toString());

    System.out.println("");

    time.addHour(30);
    System.out.println(time.toString());
    }
}
