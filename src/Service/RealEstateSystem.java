package Service;

import entity.ContactInfo;
import entity.Promotion;
import Shopping.SearchCriteria;
import entity.Customer;
import entity.RealEstateHome;

import java.util.*;

public class RealEstateSystem {
    private List<RealEstateHome> homes;
    private List<Promotion> promotionList;
    private List<ContactInfo> contactInfos;

    public RealEstateSystem() {
        this.homes = new ArrayList<>();
        this.promotionList = new ArrayList<>();
        this.contactInfos = new ArrayList<>();
    }

    public void addHome(RealEstateHome home) {
        this.homes.add(home);
    }

    public List<RealEstateHome> findHomesByIncome(Customer customer) {
        return homes;
    }

    public List<RealEstateHome> filterByCriteria(List<RealEstateHome> homes, SearchCriteria criteria) {
        return homes;
    }

    public void displayHomeDetails() {
        for(RealEstateHome home : homes) {
            System.out.println(home.toString());
        }
    }

//    public void getPromotion() {
//        try {
//            File file = new File(ConstantVar.promotionPath);
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] data = line.split(",");
//                Date validUntil = new SimpleDateFormat("yyyy-MM-dd").parse(data[2]);
//                Promotion promotion = new Promotion(data[0], Double.parseDouble(data[1]),validUntil);
//                promotionList.add(promotion);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void getContactInfo() {
//        try {
//            File file = new File(ConstantVar.contactPath);
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] data = line.split(",");
//                ContactInfo contactInfo = new ContactInfo(data[0], data[1], data[2]);
//                contactInfos.add(contactInfo);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void readFile() {
//        try {
//            File file = new File(ConstantVar.homePath);
//            Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] data = line.split(",");
//                if(data[0].equals("Luxury home")) {
//                    for (Promotion promotion : promotionList) {
//                        LuxuryHome luxuryHome = new LuxuryHome(data[1], Boolean.parseBoolean(data[2]), data[3], (List<Promotion>) promotion, (ContactInfo) contactInfos, data[4], Boolean.parseBoolean(data[5]), data[6], data[7]);
//                    }
//                } else if(data[0].equals("Moderate home")) {
//
//                } else if(data[0].equals("Basic home")) {
//
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
