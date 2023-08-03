public class Route  {
    private String pickUpAddress;
    private String destinationAddress;
    private int tripPrice;

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

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }
}
