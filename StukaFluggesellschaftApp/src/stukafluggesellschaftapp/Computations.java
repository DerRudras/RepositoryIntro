package stukafluggesellschaftapp;

//import java.lang.Math;
import java.text.DecimalFormat;

public class Computations {

    static double distance;
    final static double RADIUS = 6371.01;

    public static double distanceCities(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return RADIUS * c;
    }

    public double distance1 = distanceCities(59.57, 10.45, 38.43, 9.08);

    public void distanceToString(double distance) {
        System.out.print("The distance between ");
    }

    static String isRangeEnough(int range1, int distance) {
        String result=(range1<distance)?"has enough fuel from ":"does not have enough fuel from";
        return result;
    }
}
