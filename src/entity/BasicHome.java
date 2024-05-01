package entity;

import java.util.List;

public class BasicHome extends RealEstateHome {
    private int bedRooms;
    private int bathRoooms;
    private String color;
    private boolean hasVentilation;

    public BasicHome(String address, float price, boolean available, String image, List<Promotion> promotions, ContactInfo contactInfo,
                     int bedRooms, int bathRoooms, String color, boolean hasVentilation) {
        super(address, price, available, image, promotions, contactInfo);
        this.bedRooms = bedRooms;
        this.bathRoooms = bathRoooms;
        this.color = color;
        this.hasVentilation = hasVentilation;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public int getBathRoooms() {
        return bathRoooms;
    }

    public void setBathRoooms(int bathRoooms) {
        this.bathRoooms = bathRoooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasVentilation() {
        return hasVentilation;
    }

    public void setHasVentilation(boolean hasVentilation) {
        this.hasVentilation = hasVentilation;
    }

    @Override
    public void calculatePrice() {

    }

    @Override
    public void displayPromotions() {

    }

    @Override
    public String toString() {
        return String.format("Basic {" + super.toString() + ", Bed rooms: %d, Bath rooms: %d, Color: %s, Has ventilation: %b",
                bedRooms, bathRoooms, color, hasVentilation);
    }
}
