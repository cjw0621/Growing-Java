public class BMW extends CarC{

    private String model;
    private int price;
    private String color;
    private boolean eba;
    private boolean distanceControl;
    private boolean remoteParking;
    private boolean electricPowered;
    private boolean hybrid;

    public BMW(String transmissionType, int speed, String model, int price, String color, String engineType, boolean eba, boolean distanceControl,
               boolean remoteParking, boolean electricPowered, boolean hybrid) {
        super("BMW", speed, transmissionType, engineType);

        this.model = model;
        this.price = price;
        this.color = color;
        this.eba = eba;
        this.distanceControl = distanceControl;
        this.remoteParking = remoteParking;
        this.electricPowered = electricPowered;
        this.hybrid = hybrid;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isEba() {
        return eba;
    }

    public boolean isDistanceControl() {
        return distanceControl;
    }

    public boolean isRemoteParking() {
        return remoteParking;
    }

    public boolean isElectricPowered() {
        return electricPowered;
    }

    public boolean isHybrid(){
        return hybrid;
    }
}
