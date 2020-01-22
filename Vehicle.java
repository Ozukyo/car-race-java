public abstract class Vehicle {
    protected int actualSpeed = 0;
    protected int distanceTraveled = 0;
    protected String name;

    abstract public void prepareForLap(Race race);

    abstract public String getType();

    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

}