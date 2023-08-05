package ProjectTwo;

import java.sql.Array;
import java.util.ArrayList;

public class Car {
    private String code;
    private static int maximumCapacityOfPassengerPerTrip = 4;

    private Route fixedRoute;

    public Car() {
    }

    public Car(String code, int maximumCapacityOfPassengerPerTrip, Route fixedRoute) {
        this.code = code;
        this.maximumCapacityOfPassengerPerTrip = maximumCapacityOfPassengerPerTrip;
        this.fixedRoute = fixedRoute;
    }

    public void setMaximumCapacityOfPassengerPerTrip(int maximumCapacityOfPassengerPerTrip) {
        this.maximumCapacityOfPassengerPerTrip = maximumCapacityOfPassengerPerTrip;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public static int getMaximumCapacityOfPassengerPerTrip() {
        return maximumCapacityOfPassengerPerTrip;
    }

    public void reserveCar(Passenger passenger) {
    }


}
