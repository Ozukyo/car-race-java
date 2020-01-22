import java.util.List;
import java.util.ArrayList;

public class Race {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void simulateRace(){
        for(int i=0; i<vehicles.size(); i++) {
            prepareAndStartLapForAllVehicles(vehicles);
        }

        Vehicle winner = findWinner(vehicles);
        annouceWinner(winner);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean isThereABrokenTruck() {
        for(Vehicle vehicle: vehicles) {
            if (vehicle.getType().equals("Truck")) {
                Truck truck = (Truck) vehicle; // converting vehicle to truck
                if(truck.isBroken()) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isRaining() {
        Weather weather = new Weather();
        weather.setRaining();
        return weather.getRaining();
    }

    private void annouceWinner(Vehicle winner) {
        String message = "";
        message += winner.getType() + " " + winner.getName() + " won!\n";
        message += "and traveled " + winner.getDistanceTraveled() + "km!";
        System.out.println(message);
    }

    private Vehicle findWinner(List<Vehicle> vehicles) {
        Vehicle winner = null;
        
        for(Vehicle vehicle: vehicles) {
            if(winner == null || (winner.getDistanceTraveled() < vehicle.getDistanceTraveled())) {
                winner = vehicle;
            }
        }

        return winner;
    }

    private void prepareAndStartLapForAllVehicles(List<Vehicle> vehicles) {
        for(Vehicle vehicle: vehicles) {
            vehicle.prepareForLap(this);
            vehicle.moveForAnHour();
        }
    }

}