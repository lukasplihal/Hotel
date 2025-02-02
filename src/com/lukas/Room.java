package com.lukas;

public class Room {
    int number;
    int capacity;
    boolean isHavingBalcony;
    boolean isHavingSeeView;
    int price;

    public Room(int number, int capacity, boolean isHavingBalcony, boolean isHavingSeeView, int price) {
        this.number = number;
        this.capacity = capacity;
        this.isHavingBalcony = isHavingBalcony;
        this.isHavingSeeView = isHavingSeeView;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHavingBalcony() {
        return isHavingBalcony;
    }

    public void setHavingBalcony(boolean havingBalcony) {
        isHavingBalcony = havingBalcony;
    }

    public boolean isHavingSeeView() {
        return isHavingSeeView;
    }

    public void setHavingSeeView(boolean havingSeeView) {
        isHavingSeeView = havingSeeView;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        String description = "Pokoj č. " + number +": " + capacity + " lůžka,balkon: ";
        if (isHavingBalcony) {
            description += " ano ";
        } else {
            description += "ne";
    }
        description += ", výhled nad moře: ";
        if (isHavingSeeView) {
        description += "ano";
        } else {
            description += "ne";
        }
        description +=", cena za noc: " + price + "Kč";
        return description;
    }
}
