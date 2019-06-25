package lessons.inheritance;

public class Bus extends FuelAuto{

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availiblePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availiblePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp(){
        int  volume = getTankVolume() - getAvailiblePetrol();
        fuelUp(volume);
    }



    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassenger(int passengerNum){
        this.passengerNumber+=passengerNum;
        System.out.println("Picking up" + passengerNum + " passengers");
    }

    public void releasePassengers(){
        if (isRunnung){
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }
}
