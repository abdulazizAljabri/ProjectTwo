package ProjectTwo;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Scanner input = new Scanner(System.in);
        Route route1 = new Route("Tuwaiq Academy", "Tuwaiq Neighborhood", 50);
        Route route2 = new Route("Riyadh Park ", "U Walk", 70);

        System.out.println(" Welcome to Car Pooling System! ");
        System.out.println("------------------------------");
        try {
            System.out.println("Route 1");
            route1.routeInfo();
            System.out.println("-------------------");
            System.out.println("Route 2");
            route2.routeInfo();
            System.out.println("------------------------------");
            System.out.println("Choose one of the Route : " + '\n' + " 1. Route 1 " + '\n' + " 2. Route 2 " + '\n' + " 3. Exit ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println(" Number of Passenger per Trip : ");
                    int maximum = input.nextInt();
                    //Car 1 is reserve to Route 1 .
                    Car car1 = new Car("Camry", maximum, route1);
                    checkMaximum(maximum);
                    System.out.println("You have a Subscribers :  if Yes Enter : 1  , if No Enter : 0 ");
                    int Y = input.nextInt();
                    if (Y == 1) {
                        Subscribers passenger1 = new Subscribers(car1, "Abdulaziz", 1);
                        passengers.add(passenger1);
                    } else {
                        System.out.println("You have a Coupon :  if Yes Enter : 1  , if No Enter : 0 ");
                        int X = input.nextInt();
                        if (X == 1) {
                            Passenger passenger2 = new NonSubscribers(car1, "Abdulaziz", 1, true);
                            passengers.add(passenger2);
                        } else {
                            NonSubscribers passenger2 = new NonSubscribers(car1, "Abdulaziz", 1, false);
                            passengers.add(passenger2);
                        }

                    }

                }
                case 2 -> {
                    System.out.println(" Number of Passenger per Trip : ");
                    int maximum = input.nextInt();
                    // Car 2 is reserve to Route 2.
                    Car car2 = new Car("Mazda", maximum, route2);
                    checkMaximum(maximum);
                    System.out.println("You have a Subscribers :  if Yes Enter : 1  , if No Enter : 0 ");
                    int Y = input.nextInt();
                    if (Y == 1) {

                        Passenger passenger1 = new Subscribers(car2, "Abdulaziz", 2);
                        passengers.add(passenger1);
                    } else {
                        System.out.println("You have a Coupon :  if Yes Enter : 1  , if No Enter : 0 ");
                        int X = input.nextInt();
                        if (X == 1) {
                            Passenger passenger2 = new NonSubscribers(car2, "Abdulaziz", 2, true);
                            passengers.add(passenger2);
                        } else {
                            Passenger passenger2 = new NonSubscribers(car2, "Abdulaziz", 2, false);
                            passengers.add(passenger2);
                        }
                    }

                }
                case 3 -> {
                    exit(0);
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
        if (maximum == 0 || maximum >= 4) {
            throw new Exception("You have exceeded the maximum capacity of Passenger per Trip");
        }

    }

}
