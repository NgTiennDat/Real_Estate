package Shopping;

import entity.RealEstateHome;

import java.util.Date;

public class CartItem {
    private RealEstateHome home;
    private Date addedDate;
    private Date visitDate;

    public boolean isExpired() {
        return false;
    }
}
