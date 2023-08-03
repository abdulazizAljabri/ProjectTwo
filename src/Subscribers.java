public class Subscribers extends Passenger {


public Subscribers(Car car, String name, int id) {
    super(car, name, id);
}
    @Override
    public int calculateTripCost() {
        int cost = getCar().getFixedRoute().getTripPrice();
        cost *= 0.5;
        super.setTripCost(cost);
        return super.setTripCost(cost);
    }

    @Override
    public void display() {

            System.out.println(super.getName() + " is Subscriber : " + '\n' + " The TripCost after discount : " + getTripCost());

    }

}
