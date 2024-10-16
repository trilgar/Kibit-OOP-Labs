package lab2modification;

public class BankApplication {

    public static void main(String[] args) {
        BankVault bankVault = new BankVault();
        // Створення клієнтів
        IndividualCustomer indCustomer = new IndividualCustomer(
                "Іван", "Іванов", new Date(),
                "ID123456", "PA789012",
                MaritalStatus.SINGLE, "+380501234567");

        BusinessCustomer busCustomer = new BusinessCustomer(
                "Петро", "Петренко", new Date(),
                "PetroCorp", "+380502345678",
                50, 1_000_000.0);

        Transaction t1 = new Transaction("Поповнення", 5000.0, new Date());
        Transaction t2 = new Transaction("Зняття", -2000.0, new Date());

        try {
            BankAccount account1 = bankVault.createBankAccount(8145L, AccountType.SAVINGS, indCustomer);
            account1.addTransaction(t1);
            account1.addTransaction(t2);
            System.out.println(account1);
        } catch (VerificationException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account2 = bankVault.createBankAccount(671234L, AccountType.CURRENT, busCustomer);
            account2.addTransaction(t1);
            System.out.println(account2);
        } catch (VerificationException e) {
            System.out.println(e.getMessage());
        }

        bankVault.calculateMonthlyFees();
    }

}
