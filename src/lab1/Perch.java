package lab1;

public class Perch extends Fish {
    private String typePerch;
    private int length;

    public Perch(int age, int weight, int immersionDepth, String habitatType, String typePerch, int length) {
        super(age, weight, immersionDepth, habitatType);
        this.typePerch = typePerch;
        this.length = length;
    }

    public String getTypePerch() {
        return typePerch;
    }

    public void setTypePerch(String typePerch) {
        this.typePerch = typePerch;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return "This is Perch. His age is " + getAge() + " years old. It's weight is " + getWeight() + " grams. " +
                "The depth of its immersion is " + getImmersionDepth() + " meters. Its habitat is a " + getHabitatType() +
                ". His type is " + getTypePerch() + ". Its length is " + getLength() + " cm.";
    }
}

