import java.util.Random;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.name = generateMotorcycleName();
        actualSpeed = 100;
    }

    @Override
    public void prepareForLap(Race race) {
        if(!race.isRaining()) {
            actualSpeed = 100;
        } else {
            actualSpeed = 100- speedWhileRaining();
        }
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    public void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }

    private int speedWhileRaining(){
        Random random = new Random();
        int randomSpeed = random.nextInt(50-5+1)+5;
        return randomSpeed;
    }

    private String generateMotorcycleName() {
        Random random = new Random();
        int motorcycleNumber = random.nextInt(10-1+1)+1;
        return "M" + motorcycleNumber;
    }

       
}