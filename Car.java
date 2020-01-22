import java.util.Random;

public class Car {
    private int normalSpeed;
    private int actualSpeed;
    private int distanceTraveled = 0;
    private String name;

    public Car() {
        this.name = generateRandomName();
        normalSpeed = getRandomSpeed();
        actualSpeed = 0;
    }

    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            actualSpeed = 75;
        }
        else {
            actualSpeed = normalSpeed;
        }
    }

    public int getSpeed() {
        normalSpeed = getRandomSpeed();
        return normalSpeed;
    }

    public String getName() {
        return name;
    }

    public String speedToString() {
        return normalSpeed + "km\\h";
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    private String generateRandomName() {
        String[] carNames = {"Roamer", "Temperament", "Lioness", "Aeon", "Freedom", 
                            "Umbra", "Silver", "Spirit", "Tracer", "Patron"};
        Random rand = new Random();
        int index = rand.nextInt(carNames.length);
        return carNames[index];
    }

    private int getRandomSpeed(){
        Random random = new Random();
        int randomSpeed = random.nextInt(110- 80 +1) + 80;
        return randomSpeed;
    }
}