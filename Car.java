import java.util.Random;

public class Car extends Vehicle{
    private int normalSpeed = 0;

    public Car() {
        this.name = generateRandomName();
        normalSpeed = getRandomSpeed();
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            actualSpeed = 75;
        }
        else {
            actualSpeed = normalSpeed;
        }
    }

    @Override
    public String getType() {
        return "Car";
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