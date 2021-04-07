package task3;

public class Main {
    public static void main(String[] args) {
        Distance dist =  new Distance();
        dist.setDistance(800.5);

        System.out.println("Distance = " + dist.getDistance() + "m");

        Distance.Converter.toKm();
        Distance.Converter.toYards();
        Distance.Converter.toCm();
        Distance.Converter.toMiles();
    }
}
