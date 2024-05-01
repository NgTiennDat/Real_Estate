package Shopping;

import entity.RealEstateHome;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(RealEstateHome home, Date date) {

    }

    public boolean removeItem(RealEstateHome home) {
        return false;
    }

    public void clearExpiredItems() {

    }

    public void checkout() {

    }

}
