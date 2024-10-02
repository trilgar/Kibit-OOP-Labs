package lab1;

public class Exam {
    private String name;
    private int grade;
    private Date completionDate;

    public Exam() {
    }

    public Exam(String name, int grade, Date completionDate) {
        this.name = name;
        this.grade = grade;
        this.completionDate = completionDate;
    }

    public void printInfo() {
        System.out.printf("Exam info. Name: %s, grade: %s%n", name, grade);
        System.out.println("Completion Date: [");
        completionDate.printInfo();
        System.out.println("]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }
}
