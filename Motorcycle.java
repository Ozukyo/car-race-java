import java.util.Random;

public class Motorcycle {
    private int motorcycleNumber;
    private int speed = 100;
    private int actualSpeed;
    private String name;
    private int distanceTraveled = 0;



    public Motorcycle() {
        this.name = generateMotorcycleName();
        speed = getSpeed();
        actualSpeed=0;
    }

    public void moveForAnHour(){
        distanceTraveled +=actualSpeed;
    }

    public void prepareForLap(Race race) {
        if(race.isRaining()) {
            actualSpeed = 100;
        } else {
            actualSpeed = speedWhileRaining();
        }
    }
    
    public int getSpeed() {
        return speed;
    }

    public void speedToString() {
        System.out.println(speed + "km\\h");
    }


    public String getName() {
        return name;
    }
    
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    private int speedWhileRaining(){
        Random random = new Random();
        int randomSpeed = random.nextInt(50-5+1)+5;
        return randomSpeed;
    }

    private String generateMotorcycleName() {
        Random random = new Random();
        this.motorcycleNumber = random.nextInt(10-1+1)+1;
        return "Motorcycle " + motorcycleNumber;
    }

       
}