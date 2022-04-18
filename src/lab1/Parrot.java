package lab1;

public class Parrot extends Bird{
    private String typeParrot;
    private int height;

    public Parrot(int age, int weight, int flightAltitude, int flightSpeed, String typeParrot, int height) {
        super(age, weight, flightAltitude, flightSpeed);
        this.typeParrot = typeParrot;
        this.height = height;
    }

    public String getTypeParrot() {
        return typeParrot;
    }

    public void setTypeParrot(String typeParrot) {
        this.typeParrot = typeParrot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDescription() {
        return "This is Parrot. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The height of its flight is " + getFlightAltitude() + " meters. His type is " + getTypeParrot() +
                ". Its height is " + getHeight() + " cm." ;
    }
}
