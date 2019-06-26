package lessons.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Truck truck = new Truck("Volvo", "T1000", EngineType.PETROL, 300,500, 10);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("\n");

        ElectricCar car = new ElectricCar("Tesla", "Model-S", 4, 100500);
        car.start();
        car.stop();
        car.charge();

        System.out.println("\n");

        Bus bus = new Bus("Mercedes", "Sprinter", EngineType.DIESEL, 30, 75, 12);
        bus.fuelUp();
        bus.pickUpPassenger(5);
        bus.start();
        bus.releasePassengers();


    }
}
