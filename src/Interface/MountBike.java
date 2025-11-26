package Interface;

class MountBike implements Bikes{

    private int seatHeight;
    private int gear;
    private int speed;


//    constructor
    public MountBike(int startHeight,
                     int startSpeed,
                     int startGear) {
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed-decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
    }

//    setter and getter methods
    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
