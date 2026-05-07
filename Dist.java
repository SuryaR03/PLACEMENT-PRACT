import java.util.*;

class Dist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble(); // in meters
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        double speedMps = distance / totalTimeInSeconds;
        double speedKmph = (distance / 1000.0) / (totalTimeInSeconds / 3600.0);
        double speedMph = speedMps * 3600 / 1609;

        System.out.println("Meters/second: " + speedMps);
        System.out.println("Kilometers/hour: " + speedKmph);
        System.out.println("Miles/hour: " + speedMph);
    }
}