package lab2modification;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

class VerificationService {
    private final Map<String, String> knownIndividuals = new HashMap<>();
    private final Map<String, String> knownBusinesses = new HashMap<>();

    public VerificationService() {
        // Simulated known data for individuals
        knownIndividuals.put("ID123456", "PA789012");
        knownIndividuals.put("ID654321", "PA210987");

        // Simulated known data for businesses
        knownBusinesses.put("PetroCorp", "+380502345678");
        knownBusinesses.put("BizCorp", "UA987654321");
    }

    public void verify(Verifiable verifiable) throws VerificationException {
        Map<String, String> data = verifiable.getVerificationData();
        if (data.containsKey("personalId")) {
            String personalId = data.get("personalId");
            String passportNumber = data.get("passportNumber");
            if (knownIndividuals.containsKey(personalId) && knownIndividuals.get(personalId).equals(passportNumber)) {
                System.out.println("Individual customer %s verified successfully.".formatted(personalId));
            } else {
                throw new VerificationException("Individual customer %s verification failed.".formatted(personalId));
            }
        } else if (data.containsKey("businessName")) {
            String businessName = data.get("businessName");
            String registrationNumber = data.get("businessPhoneNumber");
            if (knownBusinesses.containsKey(businessName) && knownBusinesses.get(businessName).equals(registrationNumber)) {
                System.out.println("Business customer %s verified successfully.".formatted(businessName));
            } else {
                throw new VerificationException("Business customer %s verification failed.".formatted(businessName));
            }
        } else {
            throw new VerificationException("Verification data incomplete.");
        }
    }
}
