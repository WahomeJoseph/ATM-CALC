package Inheritance;

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear) {
//        method to refer the base class
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
}
