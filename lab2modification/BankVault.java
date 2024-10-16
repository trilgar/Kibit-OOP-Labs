package lab2modification;

import java.util.HashMap;
import java.util.Map;


public class BankVault {
    private Map<Long, BankAccount> bankAccounts;
    private VerificationService verificationService;

    public BankVault() {
        bankAccounts = new HashMap<>();
        verificationService = new VerificationService();
    }

    public void calculateMonthlyFees() {
        for (BankAccount bankAccount : bankAccounts.values()) {
            Billable billableCustomer = bankAccount.getCustomer();
            System.out.printf("Monthly fee for account #%s is %s%n", bankAccount.getAccountNumber(), billableCustomer.calculateMonthlyFee());
        }
    }

    public BankAccount createBankAccount(long accountNumber, AccountType accountType, Customer customer) throws VerificationException {
        verificationService.verify(customer);
        BankAccount bankAccount = new BankAccount(accountNumber, accountType, customer);
        bankAccounts.put(accountNumber, bankAccount);
        return bankAccount;
    }

    public BankAccount getBankAccount(long accountNumber) {
        return bankAccounts.get(accountNumber);
    }
}
