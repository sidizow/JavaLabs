package lab1;

public abstract class Fish extends Animal{
    private int immersionDepth;
    private String habitatType; //fresh water or sea water

    public Fish(int age, int weight, int immersionDepth, String habitatType) {
        super(age, weight);
        this.immersionDepth = immersionDepth;
        this.habitatType = habitatType;
    }

    public int getImmersionDepth() {
        return immersionDepth;
    }

    public void setImmersionDepth(int immersionDepth) {
        this.immersionDepth = immersionDepth;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    public String getDescription() {
        return "This is a abstract class of Fish";
    }
}
