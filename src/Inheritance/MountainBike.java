package Inheritance;

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int cadence, int speed, int gear, int seatHeight) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }
}
