import java.util.List;
import java.util.ArrayList;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {

        for(int i=0; i<10; i++) {
            race.getVehicles().add(new Car());
        }

        for(int i=0; i<10; i++) {
            race.getVehicles().add(new Motorcycle());
        }

        for(int i=0; i<10; i++) {
            race.getVehicles().add(new Truck());
        }
    }


    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.simulateRace();
        

    }
}