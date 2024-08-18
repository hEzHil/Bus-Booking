package BusBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    private String name;
    private int busNo;
    private Date date;

    public  Booking() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = in.nextLine();
        System.out.println("Enter the bus number : ");
        busNo = in.nextInt();
        in.nextLine();
        System.out.println("Enter the date to travel (dd-MM-yyyy)");
        String dateInput = in.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date = dateFormat.parse(dateInput);
        } catch (ParseException e){
            e.printStackTrace();
        }

    }


    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for(Booking b:bookings){
            if(b.busNo == busNo && b.date.equals(date));
            booked++;
        }
        return booked < capacity ? true : false;
    }
}
