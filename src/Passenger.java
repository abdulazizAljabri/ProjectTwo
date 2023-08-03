public abstract class Passenger extends Car {

    private String name;
    private int ID;
    private int tripCost;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTripCost() {
        return tripCost;
    }

    public int setTripCost(int tripCost) {
        this.tripCost = tripCost;
        return tripCost;
    }
    public Passenger(Car car ,String name,int id){
        this.ID =id;
        this.car = car;
        this.name = name;
    }

    public abstract int calculateTripCost();


    public void display(){
        System.out.println(" The Information of Trip : " + " CarCode : " +getCode()+"RoutePrice : " +getTripCost()+"PassengerName : " +getName());
    }
}
