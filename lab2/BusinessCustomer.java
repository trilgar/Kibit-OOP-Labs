package lab2;

public class BusinessCustomer extends Customer{
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
