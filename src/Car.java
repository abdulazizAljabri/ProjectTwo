public class Car {
    private String code;
    private int maximumCapacityOfPassengerPerTrip = 4;

    private Route fixedRoute;

    public Car() {
    }

    public Car(String code, int maximumCapacityOfPassengerPerTrip, Route fixedRoute) {
        this.code = code;
        this.maximumCapacityOfPassengerPerTrip = maximumCapacityOfPassengerPerTrip;
        this.fixedRoute = fixedRoute;
    }

    public int setMaximumCapacityOfPassengerPerTrip(int maximumCapacityOfPassengerPerTrip) {
        this.maximumCapacityOfPassengerPerTrip = maximumCapacityOfPassengerPerTrip;
        return maximumCapacityOfPassengerPerTrip;
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

    public int getMaximumCapacityOfPassengerPerTrip() {
        return maximumCapacityOfPassengerPerTrip;
    }


}
