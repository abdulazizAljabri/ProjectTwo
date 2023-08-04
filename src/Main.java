import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Scanner input = new Scanner(System.in);
        Route route1 = new Route();
        Route route2 = new Route();

        System.out.println(" Welcome to Car Pooling System! ");
        System.out.println("------------------------------");
        try {
            System.out.println("Enter the Route1  ");
            System.out.println("pickUpAddress : ");
            route1.setPickUpAddress(input.nextLine());
            System.out.println("destinationAddress : ");
            route1.setDestinationAddress(input.nextLine());
            System.out.println("Trip Price : ");
            route1.setTripPrice(input.nextInt());
            System.out.println("------------------------------");
            System.out.println("Enter the Route2  ");
            System.out.println("pickUpAddress : ");
            route2.setPickUpAddress(input.next());
            System.out.println("destinationAddress : ");
            route2.setDestinationAddress(input.next());
            System.out.println("Trip Price : ");
            route2.setTripPrice(input.nextInt());
            System.out.println("------------------------------");
            System.out.println("Choose one of the Route : " + '\n' + " 1. Route 1 " + '\n' + " 2. Route 2 ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Maximum Capacity of Passenger per Trip : ");
                    int maximum = input.nextInt();
                    Car car1 = new Car("Car1", maximum, route1);
                    System.out.println("You have a Subscribers :  if Yes Enter : 1  , if No Enter : 0 ");
                    int Y = input.nextInt();
                    if (Y == 1) {
                        Passenger passenger1 = new Subscribers(car1, "Abdulaziz", 1);
                        checkMaximum(passenger1.getCar().getMaximumCapacityOfPassengerPerTrip());
                        passengers.add(passenger1);
                    } else {
                        System.out.println("You have a Coupon :  if Yes Enter : 1  , if No Enter : 0 ");
                        int X = input.nextInt();
                        if (X == 1) {
                            Passenger passenger2 = new Non_Subscribers(car1, "Abdulaziz", 1, true);
                            checkMaximum(passenger2.getCar().getMaximumCapacityOfPassengerPerTrip());
                            passengers.add(passenger2);
                        } else {
                            Passenger passenger2 = new Non_Subscribers(car1, "Abdulaziz", 1, false);
                            checkMaximum(passenger2.getCar().getMaximumCapacityOfPassengerPerTrip());
                            passengers.add(passenger2);
                        }

                    }

                }
                case 2 -> {
                    System.out.println("Maximum Capacity of Passenger per Trip : ");
                    int maximum = input.nextInt();
                    Car car2 = new Car("Car2", maximum, route2);
                    System.out.println("You have a Subscribers :  if Yes Enter : 1  , if No Enter : 0 ");
                    int Y = input.nextInt();
                    if (Y == 1) {

                        Passenger passenger1 = new Subscribers(car2, "Abdulaziz", 2);
                        checkMaximum(passenger1.getCar().getMaximumCapacityOfPassengerPerTrip());
                        passengers.add(passenger1);
                    } else {
                        System.out.println("You have a Coupon :  if Yes Enter : 1  , if No Enter : 0 ");
                        int X = input.nextInt();
                        if (X == 1) {
                            Passenger passenger2 = new Non_Subscribers(car2, "Abdulaziz", 2, true);
                            checkMaximum(passenger2.getCar().getMaximumCapacityOfPassengerPerTrip());
                            passengers.add(passenger2);
                        } else {
                            Passenger passenger2 = new Non_Subscribers(car2, "Abdulaziz", 2, false);
                            checkMaximum(passenger2.getCar().getMaximumCapacityOfPassengerPerTrip());
                            passengers.add(passenger2);
                        }
                    }

                }
            }
            passengers.forEach(passenger -> {
                        passenger.calculateTripCost();
                        passenger.display();
                        System.out.println("----------------");
                    }
            );
        } catch (InputMismatchException e1) {
            System.out.println("Invalid input : ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkMaximum(int maximum) throws Exception {
        if (maximum <= 0) {
            throw new Exception("Error : Maximum capacity should be greater than 0");
        }

    }

}
