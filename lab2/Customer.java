package lab2;

public class Customer {
    private String name;
    private String surname;
    private Date birthdate;

    public Customer() {
    }

    public Customer(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.printf("Customer info: name=%s, surname=%s%n", name, surname);
        System.out.println("Customer birthday: ");
        birthdate.printInfo();
    }

    @Override
    public String toString() {
        return "name=%s, surname=%s, birthday=[%s]".formatted(name, surname, birthdate.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
