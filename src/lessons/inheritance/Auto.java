package lessons.inheritance;

public class Auto {

    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunnung;


    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public void start(){
        isRunnung = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop(){
        isRunnung = false;
        currentSpeed = 0;
        System.out.println("Auto is stopped");
    }

    public void accelerate(int kmPerHour){
        currentSpeed+=kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHour");
    }


    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunnung() {
        return isRunnung;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", currentSpeed=" + currentSpeed +
                ", isRunnung=" + isRunnung +
                '}';
    }
}

