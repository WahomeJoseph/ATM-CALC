package Inheritance;

class InheritDemo {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 2);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat Height is: " + mountainBike.seatHeight);
        System.out.println("Bike Speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brakes is: " + mountainBike.speed);
    }
}
