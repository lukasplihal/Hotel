package com.lukas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Guest> otherGuests = new ArrayList<>();
    boolean isWorkingStay;

    public Booking(Room room, Guest guest, LocalDate checkIn, LocalDate checkOut, boolean isWorkingStay) {
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingStay = isWorkingStay;
    }



    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        isWorkingStay = workingStay;
    }

    public void addAnotherGuest(Guest guest) {
        otherGuests.add(guest);
    }

    public String getDescription() {
        StringBuilder result = new StringBuilder(new StringBuilder(" Rezervováno pro " + guest.getDescription() + " na pokoj " + room.getNumber()
                + " v termínu " + checkIn + " - " + checkOut)
                + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
        if (! otherGuests.isEmpty()) {
            result.append(", další hosté: \n");
            for (Guest guest : otherGuests) {
                result.append(guest.getDescription()).append("\n");
            }
        }
        return result.toString();
        }


}
