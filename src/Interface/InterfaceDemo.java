package Interface;

public class InterfaceDemo {

    public static void main(String[] args) {
        MountBike mountBike = new MountBike(30, 12, 4);

        System.out.println("Gear is: " + mountBike.getGear());
        System.out.println("Seat Height is: " + mountBike.getSeatHeight());
        System.out.println("Bike Speed is: " + mountBike.getSpeed());

        mountBike.applyBrake(2);
        System.out.println("Bike speed after applying brakes is: " + mountBike.getSpeed());

        mountBike.speedUp(22);
        System.out.println("Bike new Speed after increment is: " + mountBike.getSpeed());
    }
}
