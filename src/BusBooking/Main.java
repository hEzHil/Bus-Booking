package BusBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        buses.add(new Bus(1,true,5));
        buses.add(new Bus(2,false,5));
//        for (Bus b : buses) {
//            b.display();
//        }


        Scanner in = new Scanner(System.in);
        int userInput = 1;
        while(userInput == 1){
            System.out.println("Enter 1 for Booking or 2 for Exits");
            userInput = in.nextInt();
            if(userInput == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Sorry. Bus is full. Try another Bus or date");
                }
            }
        }
    }
}
