package entity;

import java.util.List;

public class ModerateHome extends RealEstateHome {
    private int floors;
    private double roadWidth;
    private boolean skyLight;

    public ModerateHome(String address, float price, boolean available, String image, List<Promotion> promotions, ContactInfo contactInfo,
                        int floors, double roadWidth, boolean skyLight) {
        super(address, price, available, image, promotions, contactInfo);
        this.floors = floors;
        this.roadWidth = roadWidth;
        this.skyLight = skyLight;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getRoadWidth() {
        return roadWidth;
    }

    public void setRoadWidth(double roadWidth) {
        this.roadWidth = roadWidth;
    }

    public boolean isSkyLight() {
        return skyLight;
    }

    public void setSkyLight(boolean skyLight) {
        this.skyLight = skyLight;
    }

    @Override
    public void calculatePrice() {

    }

    @Override
    public void displayPromotions() {

    }

    @Override
    public String toString() {
        return String.format("Moderate {" + super.toString() + ", Floors: %d, Road width: %.2f, Sky light: %b",
                floors, roadWidth, skyLight);
    }
}
