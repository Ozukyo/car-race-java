import java.util.Random;

public class Car {
    private int normalSpeed;
    private String name;


    public int getRandomSpeed(){
        Random random = new Random();
        int randomSpeed = random.nextInt(110- 80 +1) + 80;
        return randomSpeed;
    }

    public int getSpeed() {
        normalSpeed = getRandomSpeed();
        return normalSpeed;
    }

    public void generateRandomName() {
        String[] carNames = {"Roamer", "Temperament", "Lioness", "Aeon", "Freedom", 
                            "Umbra", "Silver", "Spirit", "Tracer", "Patron"};
        Random rand = new Random();
        int index = rand.nextInt(carNames.length);
        name = carNames[index];
    }

    public String getName() {
        generateRandomName();
        return name;
    }
}