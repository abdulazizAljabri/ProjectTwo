package ProjectTwo;


public class Subscribers extends Passenger {


    public Subscribers(Car car, String name, int id) {
        super(car, name, id);
    }

    @Override
    public double calculateTripCost() {
        double discount = 0.5;
        double cost = getCar().getFixedRoute().getTripPrice();
        cost *= discount;
        this.setTripCost(cost);
        return this.getTripCost();
    }

    @Override
    public void display() {
       System.out.println(super.getName() + " is Subscriber : " + '\n' + " The TripCost after discount : " + getTripCost());

    }

}
