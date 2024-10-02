package lab2;

public class Transaction {
    private String description;
    private double amount;
    private Date transactionDate;

    public Transaction() {
    }

    public Transaction(String description, double amount, Date transactionDate) {
        this.description = description;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public void printInfo() {
        System.out.printf("Transaction Info: description=%s, amount=%s%n", description, amount);
        System.out.println("TransactionDate: ");
        transactionDate.printInfo();
    }

    @Override
    public String toString() {
        return "description=%s, amount=%s, transactionDate=[%s]".formatted(description, amount, transactionDate.toString());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
