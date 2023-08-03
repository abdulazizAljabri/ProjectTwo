import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(" Welcome to Car Pooling System! ");
            Route route1 = new Route("from A", "to B", 50);
            Route route2 = new Route("from C", "to D", 60);

            Car car1 = new Car("Car1", 1, route1);
            Car car2 = new Car("Car2", 3, route2);

            ArrayList<Passenger> passengers = new ArrayList<Passenger>();
            Passenger passenger1 = new Subscribers(car1, "Abdulaziz", 1);
            Passenger passenger2 = new Non_Subscribers(car2, "Abdulaziz", 2, true);
            checkMaximum(passenger1.getCar().getMaximumCapacityOfPassengerPerTrip());
            passengers.add(passenger1);
            checkMaximum(passenger2.getCar().getMaximumCapacityOfPassengerPerTrip());
            passengers.add(passenger2);

            passengers.forEach(passenger -> {
                        passenger.calculateTripCost();
                        passenger.display();
                        System.out.println("----------------");
                    }
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkMaximum(int maximum)throws Exception {
        if (maximum <= 0) {
            throw new Exception(" Error: ");
        }

    }
}