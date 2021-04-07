package task3;

public class Distance {
    static double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static double getDistance() {
        return distance;
    }

    public void print(){
        System.out.println("Distance in meters: " + distance);
    }

    public static class Converter{
        public static void toKm(){
            System.out.println("Kilometers: " + Distance.distance / 1000);
        }
        public static void toMiles(){
            System.out.println("Miles: " + Distance.distance / 1609);
        }
        public static void toYards(){
            System.out.println("Yards: " + Distance.distance * 1.09361);
        }
        public static void toCm(){
            System.out.println("Centimeters: " + Distance.distance * 100);
        }

    }

}
