package lab1;

public abstract class Bird extends Animal {
    private int flightAltitude;
    private int flightSpeed;

    public Bird(int age, int weight, int flightAltitude, int flightSpeed) {
        super(age, weight);
        this.flightAltitude = flightAltitude;
        this.flightSpeed = flightSpeed;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public String getDescription() {
        return "This is a abstract class of Birds";
    }
}
