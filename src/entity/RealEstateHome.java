package entity;

import java.util.List;
public abstract class RealEstateHome {

    private String address;
    private float price;
    private boolean available;
    private String image;

    private List<Promotion> promotions;

    private ContactInfo contactInfo;

    public RealEstateHome(String address, float price, boolean available, String image, List<Promotion> promotions, ContactInfo contactInfo) {
        this.address = address;
        this.price = price;
        this.available = available;
        this.image = image;
        this.promotions = promotions;
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getImage() {
        return image;
    }

    public void setImage() {
        this.image = image;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void calculatePrice();

    public abstract void displayPromotions();

    @Override
    public String toString() {
        return String.format("Address: %s, Price: %.2f, Available: %b, Image: %s ", address, price, available,image);
    }

}
