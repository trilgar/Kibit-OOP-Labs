package lab2modification;

import java.util.HashMap;
import java.util.Map;

public class BusinessCustomer extends Customer {
    private String businessName;
    private String businessPhoneNumber;
    private int numberOfEmployees;
    private double annualTurnover;

    public BusinessCustomer() {
    }

    public BusinessCustomer(String name,
                            String surname,
                            Date birthdate,
                            String businessName,
                            String businessPhoneNumber,
                            int numberOfEmployees,
                            double annualTurnover) {
        super(name, surname, birthdate);
        this.businessName = businessName;
        this.businessPhoneNumber = businessPhoneNumber;
        this.numberOfEmployees = numberOfEmployees;
        this.annualTurnover = annualTurnover;
    }

    @Override
    public String toString() {
        return super.toString() + ", businessName=%s, businessPhoneNumber=%s, numberOfEmployees=%s, annualTurnover=%s".formatted(businessName, businessPhoneNumber, numberOfEmployees, annualTurnover);
    }

    @Override
    public double calculateMonthlyFee() {
        return 100 + numberOfEmployees * 5.0;
    }

    @Override
    public Map<String, String> getVerificationData() {
        Map<String, String> data = new HashMap<>();
        data.put("businessName", businessName);
        data.put("businessPhoneNumber", businessPhoneNumber);
        return data;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(double annualTurnover) {
        this.annualTurnover = annualTurnover;
    }
}
