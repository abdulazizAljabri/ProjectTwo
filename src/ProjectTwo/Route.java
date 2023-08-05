package ProjectTwo;

public class Route  {
    private String pickUpAddress;
    private String destinationAddress;

    private double tripPrice;

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public Route() {
    }

    public Route(String pickUpAddress, String destinationAddress, int tripPrice) {
        this.pickUpAddress = pickUpAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void routeInfo(){
        System.out.println("Pick up address: " + pickUpAddress);
        System.out.println("Destination address: " + destinationAddress);
        System.out.println("Trip price: " + tripPrice);
    }
}
