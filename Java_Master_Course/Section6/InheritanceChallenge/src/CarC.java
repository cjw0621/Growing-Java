public class CarC extends Vehicle {

    private String make;
    private String transmissionType;
    private String engineType;

    public CarC(String make, int speed, String transmissionType, String engineType) {
        super("Wheel", speed, 4);

        this.make = make;
        this.transmissionType = transmissionType;
        this.engineType = engineType;
    }

    public String getMake() {
        return make;
    }
    public String getTransmissionType() {
        return transmissionType;
    }

    public String getEngineType() {
        return engineType;
    }
}
