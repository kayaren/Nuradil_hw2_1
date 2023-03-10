import java.lang.management.GarbageCollectorMXBean;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow(5,"korova", Color.BLACK );
        cow.getInfo();
        cow.makeVoice("мууу");
        cow.makeVoice();


        Ram ram = new Ram(6,"alex", Color.WHITE);
        ram.getInfo();
        ram.makeVoice();
        System.out.println("-----------");

        Ram ram1 = new Ram(3,"nur", Color.GRAY);
        ram1.getInfo();
        ram.makeVoice();

    }
}