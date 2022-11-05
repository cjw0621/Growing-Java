public class MainA {
    public static void main(String[] args) {
        BMW _430i = new BMW("Automatic", 155,"430i",47400,"Black",
                "2.0-liter BMW TwinPower Turbo inline 4-cylinder", true, true,
                false, false, false);

        System.out.println(_430i.getMake());
        System.out.println("Model: " + _430i.getModel());
        System.out.println("Transmission Type: " + _430i.getTransmissionType());
        System.out.println("Engine Type: " + _430i.getEngineType());
        System.out.println("Top Speed: " + _430i.getSpeed() + " MPH");
        System.out.println("MSRP: $" + _430i.getPrice());
        System.out.println("Electronic Braking Assistance: " + _430i.isEba());
        System.out.println("Distance Control: " + _430i.isDistanceControl());
        System.out.println("Remote Parking: " + _430i.isRemoteParking());
        System.out.println("Electric Vehicle: " + _430i.isElectricPowered());
        System.out.println("Hybrid Vehicle: " + _430i.isHybrid());
        System.out.println("");

        System.out.println("Testing inheritance:");
        System.out.println("Number of wheels: " + _430i.getWheels());
        System.out.println("Steering type: " + _430i.getSteering());
    }
}
