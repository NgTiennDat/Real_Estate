package entity;

import java.util.List;

public class LuxuryHome extends RealEstateHome {
    private String view;
    private boolean hasFrontYard;
    private String smartDevices;
    private String specialRoom;

    public LuxuryHome(String address, float price,boolean available, String image, List<Promotion> promotions, ContactInfo contactInfo,
                      String view, boolean hasFrontYard, String smartDevices, String specialRoom) {
        super(address, price,available, image, promotions, contactInfo);
        this.view = view;
        this.hasFrontYard = hasFrontYard;
        this.smartDevices = smartDevices;
        this.specialRoom = specialRoom;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public boolean isHasFrontYard() {
        return hasFrontYard;
    }

    public void setHasFrontYard(boolean hasFrontYard) {
        this.hasFrontYard = hasFrontYard;
    }

    public String isSmartDevices() {
        return smartDevices;
    }

    public void setSmartDevices(String smartDevices) {
        this.smartDevices = smartDevices;
    }

    public String getSpecialRoom() {
        return specialRoom;
    }

    public void setSpecialRoom(String specialRoom) {
        this.specialRoom = specialRoom;
    }

    @Override
    public void calculatePrice() {

    }

    @Override
    public void displayPromotions() {

    }

    @Override
    public String toString() {
        return String.format("Luxury {" + super.toString() + "View: %s, Has front yard: %b,Smart devices: %s, Special room: %s",
                view, hasFrontYard, smartDevices, specialRoom);
    }
}
