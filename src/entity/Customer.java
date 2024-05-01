package entity;

public class Customer {
    private String name;
    double monthlyIncome;

    public Customer(String name, double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

}
