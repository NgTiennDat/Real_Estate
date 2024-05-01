import Service.RealEstateSystem;
import entity.LuxuryHome;

public class Main {
    public static void main(String[] args) {
        RealEstateSystem realEstateSystem = new RealEstateSystem();

        realEstateSystem.addHome(new LuxuryHome("Hanoi", 255.0f, true, "Rose Garden", null, null,
                "River view", false, "Bridge", "Love room"));

        realEstateSystem.displayHomeDetails();

    }
}