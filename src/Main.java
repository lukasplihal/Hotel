import com.lukas.Booking;
import com.lukas.Guest;
import com.lukas.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest adela = new Guest("Adéla Malíková", LocalDate.of(1993,3,13));
        Guest jan = new Guest("Jan Dvořáček", LocalDate.of(1995,5,15));

        jan.setDateOfBirth(LocalDate.of(1995,4,5));
        System.out.println("Jan Dvořáček byl narozen " + jan.getDateOfBirth());

        Room room1 = new Room(1,1,true,true,1000);
        Room room2 = new Room(2,1,true,true,1000);
        Room room3 = new Room(3,3,false,true,2400);

        Booking adelabooking = new Booking(room1,adela,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),false);
        Booking bothbooking = new Booking(room3,adela,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),false);
        bothbooking.addAnotherGuest(jan);

        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(adelabooking);
        bookingList.add(bothbooking);

        System.out.println("Výpis všech rezervací v systému:");
        for (Booking booking : bookingList) {
            System.out.println(booking.getDescription());
        }

    }
}