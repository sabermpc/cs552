public class Odometer {
    private double totalOdo, trip;

    public Odometer() {
        totalOdo = 0;
        trip = 0;
    }
    public Odometer(double totalMiles) {
        totalOdo = totalMiles;
        trip = 0;
    }
    public void resetTrip() {
        trip = 0;
    }
    public void addMiles(double miles) {
        totalOdo = totalOdo + miles;
        trip = trip + miles;
    }
    public double getTotalMiles() {
        return totalOdo;
    }
    public double getTripMiles() {
        return trip;
    }
    public String toString() {
        return String.format("Odometer:\tmiles=[%.1f]\ttrip=[%.1f].", totalOdo, trip);
    }

    public static void main(String[] args) {
        Odometer m1 = new Odometer();
        m1.addMiles(92.8);
        System.out.println(m1);

        m1.resetTrip();
        System.out.println(m1);

        m1.addMiles(8.46);
        System.out.println(m1);
        System.out.printf("total miles=%.1f%n", m1.getTotalMiles());
        System.out.printf("trip miles=%.1f%n", m1.getTripMiles());

        Odometer m2 = new Odometer(6.52);
        System.out.println(m2);
        m2.addMiles(1.02);
        System.out.println(m2);
        m2.resetTrip();
        System.out.println(m2);
    }
}