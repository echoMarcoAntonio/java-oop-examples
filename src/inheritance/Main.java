package inheritance;

public class Main {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(30, 10, 5, 25);

        System.out.println("Cadence: " + mb.cadence);
        System.out.println("Speed: " + mb.speed);
        System.out.println("Gear: " + mb.gear);
        System.out.println("Seat Height: " + mb.seatHeight);
    }
}
