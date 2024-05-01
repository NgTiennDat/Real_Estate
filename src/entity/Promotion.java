package entity;

import java.util.Date;

public class Promotion {
    private String desScription;
    private double discountRate;
    private Date validUntil;

    public Promotion() {
        this.desScription = "";
        this.discountRate = 0.0f;
        this.validUntil = new Date();
    }

    public Promotion(String desScription, double discountRate, Date validUntil) {
        this.desScription = desScription;
        this.discountRate = discountRate;
        this.validUntil = validUntil;
    }

    public void applyPromotion() {

    }

    public String getDesScription() {
        return desScription;
    }

    public void setDesScription(String desScription) {
        this.desScription = desScription;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
