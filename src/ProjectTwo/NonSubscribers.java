package ProjectTwo;

import ProjectTwo.Car;

public class NonSubscribers extends Passenger {


    private boolean isCoupon;

    public NonSubscribers(Car car, String name, int id, boolean isCoupon) {
        super(car, name, id);
        this.isCoupon = isCoupon;
    }

    @Override
    public double calculateTripCost() {
        double cost = getCar().getFixedRoute().getTripPrice();
        if (isCoupon) {
            cost = (int) (cost - (cost * 0.1));
            super.setTripCost(cost);
        }
        return super.setTripCost(cost);
    }

    @Override
    public void display() {
        if (isCoupon) {
            System.out.println(super.getName() + " is have Coupon : " + '\n' + " The TripCost after discount : " + getTripCost());
        } else {
            System.out.println(getName() + " You don't have Coupon : " + '\n' + " The TripCost: " + getTripCost());
        }
    }
}
