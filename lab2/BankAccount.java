package lab2;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private long accountNumber;
    private AccountType accountType;
    private Customer customer;
    private List<Transaction> transactions;

    public BankAccount() {
        this.accountNumber = 0;
        this.accountType = AccountType.UNKNOWN;
        this.transactions = new ArrayList<>();
    }

    public BankAccount(long accountNumber, AccountType accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printInfo() {
        System.out.printf("Info of bank account #%s: accountType=%s%n", accountNumber, accountType);
        System.out.println("Customer Info: ");
        customer.printInfo();
        System.out.println("Transactions info: ");

        for (Transaction transaction : transactions) {
            transaction.printInfo();
        }
    }

    @Override
    public String toString() {
        //iterate over transactions and append each transaction to the StringBuilder
        StringBuilder transactionsStr = new StringBuilder();
        for (Transaction transaction : this.transactions) {
            transactionsStr.append(transaction.toString()).append('\n');
        }

        return "Bank account #%s: accountType=%s,%n customer=[%n%s],%n transactions=[%n%s]".formatted(accountNumber, accountType, customer.toString(), transactionsStr.toString());
    }

    public void printShortInfo() {

        double sum = 0;

        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }

        System.out.printf("Short Info of bank account #%s: nameOfCustomer=%s, sumOfTransactions=%s", accountNumber, customer.getName(), sum);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
