import java.util.Random;

public class Weather {
    private boolean raining;

    public void setRaining() {
        double randomNumber = getRandomPercentage();
        if (randomNumber <= 0.30) {
            raining = true;
        } else if (randomNumber>0.30) {
            raining = false;
        }
        
    }

    public boolean getRaining() {
        return raining;
    }

    public double getRandomPercentage() {
        Random random = new Random();
        double randomPercentage = random.nextDouble();
        return randomPercentage;
    }

    
}   