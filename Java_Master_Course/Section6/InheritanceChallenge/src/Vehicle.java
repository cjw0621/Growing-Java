public class Vehicle {

    private String steering;
    private int speed;
    private int wheels;

    public Vehicle(String steering, int speed, int wheels) {
        this.steering = steering;
        this.speed = speed;
        this.wheels = wheels;
    }

    public String getSteering() {
        return steering;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }
}
