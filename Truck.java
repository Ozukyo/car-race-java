import java.util.Random;

public class Truck extends Vehicle {
    private boolean breakdownTurnsLeft = false;
    private int turnsBroken = 0;

    public Truck() {
        name = generateRandomName();
        actualSpeed = 100;
    }

    @Override
    public void prepareForLap(Race race) {

        if (breakdownTurnsLeft) {
            actualSpeed = 0;
            turnsBroken += 1;
        }
        else {
            actualSpeed = 100;
            riskBreakingDown();
            turnsBroken = 0;
        }

        if (turnsBroken == 2) {
            breakdownTurnsLeft = false;
        }
    }

    @Override
    public String getType() {
        return "Truck";
    }

    public boolean isBroken() {
        return breakdownTurnsLeft;
    }

    private String generateRandomName() {
        Random random = new Random();
        int motorcycleNumber = random.nextInt(1000);
        return String.valueOf(motorcycleNumber);
    }

    private void riskBreakingDown() {
        Random random = new Random();
        double breakdownChance = random.nextDouble();

        if (breakdownChance <= 0.05) {
            breakdownTurnsLeft = true;
        }
    }

}