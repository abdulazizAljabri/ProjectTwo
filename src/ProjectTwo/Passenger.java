package ProjectTwo;


public abstract class Passenger extends Car {

    private String name;
    private int id;
    private double tripCost;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getTripCost() {
        return tripCost;
    }

    public double setTripCost(double tripCost) {
        this.tripCost = tripCost;
        return tripCost;
    }
    public Passenger(Car car ,String name,int id){
        this.id =id;
        this.car = car;
        this.name = name;
    }

    public abstract double calculateTripCost();


    public void display(){
        System.out.println(" The Information of Trip : " + " CarCode : " +getCode()+"RoutePrice : " +getTripCost()+"PassengerName : " +getName());
    }
}
