package lab2;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Oleg", "Shapovalov", new Date(26, 4, 2004));
        Transaction transaction1 = new Transaction("hnwdad", 104.7, new Date(26, 9, 2024));
        Transaction transaction2 = new Transaction("daefeg", 1200, new Date(3, 4, 2024));
        Transaction transaction3 = new Transaction("134gfwfe", 10.3, new Date(8, 2, 2024));
        BankAccount bankAccount1 = new BankAccount(61283831, AccountType.BUSINESS, customer1);
        bankAccount1.addTransaction(transaction1);
        bankAccount1.addTransaction(transaction2);
        bankAccount1.addTransaction(transaction3);

        System.out.println("Bank account1 full info: ");
        System.out.println(bankAccount1);
        System.out.println();
        System.out.println("_____________________");

        Customer customer2 = new IndividualCustomer("Olena", "Fedorenko", new Date(27, 6, 2002), "1234567890", "1234567890", MaritalStatus.MARRIED, "380123456789");
        Transaction transaction4 = new Transaction("hnwdad", 100, new Date(26, 9, 2024));
        BankAccount bankAccount2 = new BankAccount(1782331, AccountType.CURRENT, customer2);
        bankAccount2.addTransaction(transaction1);
        bankAccount2.addTransaction(transaction2);
        bankAccount2.addTransaction(transaction4);

        System.out.println("Bank account2 full info: ");
        System.out.println(bankAccount2);
        System.out.println();
        System.out.println("_____________________");

        Customer customer3 = new BusinessCustomer("Nikita", "Fordui", new Date(27, 6, 2002), "Technologies LTS", "38092771222", 15, 40000000);
        BankAccount bankAccount3 = new BankAccount(4441144, AccountType.SAVINGS, customer3);
        bankAccount3.addTransaction(transaction3);
        bankAccount3.addTransaction(transaction4);
        bankAccount3.addTransaction(transaction2);

        System.out.println("Bank account3 full info: ");
        System.out.println(bankAccount3);
        System.out.println();
        System.out.println("_____________________");
    }
}
