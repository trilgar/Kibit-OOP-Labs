package lab1;

public class HumanInfo {
    private String name;
    private String surname;
    private Date birthday;

    public HumanInfo() {
    }

    public HumanInfo(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public void printInfo() {
        System.out.printf("Human info. Name: %s, Surname: %s%n", name, surname);
        System.out.println("Birthday: [");
        birthday.printInfo();
        System.out.println("]");
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
