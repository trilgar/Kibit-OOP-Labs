package lab2modification;

import java.util.HashMap;
import java.util.Map;

public class IndividualCustomer extends Customer {
    private String personalId;
    private String passportNumber;
    private MaritalStatus maritalStatus;
    private String personalPhoneNumber;

    public IndividualCustomer() {
    }

    public IndividualCustomer(String name,
                              String surname,
                              Date birthdate,
                              String personalId,
                              String passportNumber,
                              MaritalStatus maritalStatus,
                              String personalPhoneNumber) {
        super(name, surname, birthdate);
        this.personalId = personalId;
        this.passportNumber = passportNumber;
        this.maritalStatus = maritalStatus;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", personalId=%s, passportNumber=%s, maritalStatus=%s, personalPhoneNumber=%s".formatted(personalId, passportNumber, maritalStatus, personalPhoneNumber);
    }

    @Override
    public double calculateMonthlyFee() {
        return 15.0;
    }

    @Override
    public Map<String, String> getVerificationData() {
        Map<String, String> data = new HashMap<>();
        data.put("personalId", personalId);
        data.put("passportNumber", passportNumber);
        return data;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }

    public void setPersonalPhoneNumber(String personalPhoneNumber) {
        this.personalPhoneNumber = personalPhoneNumber;
    }
}
