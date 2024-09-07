package lab1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private LevelOfDegree levelOfDegree;
    private HumanInfo info;
    private List<Exam> exams;

    public Student() {
    }

    public Student(LevelOfDegree levelOfDegree, HumanInfo info) {
        this.levelOfDegree = levelOfDegree;
        this.info = info;
        this.exams = new ArrayList<>();
    }

    public void printInfo() {
        System.out.println("Student Info: [");
        System.out.printf("Level Of Degree: %s%n", levelOfDegree);

        System.out.println("Human Info: [");
        info.printInfo();
        System.out.println("]");

        System.out.println("Exams: [");
        for (Exam exam : exams) {
            exam.printInfo();
        }
        System.out.println("]");

        System.out.println("]");
    }

    public void printShortInfo() {
        double sum = 0;
        for (Exam exam : exams) {
            sum += exam.getGrade();
        }
        double average = sum / exams.size();
        System.out.printf("Short Student info. Name: %s, Surname: %s, Average Grade: %s%n",
                info.getName(), info.getSurname(), average);
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public void removeExam(String examName) {
        int indexToRemove = -1;
        for (int i = 0; i < exams.size(); i++) {
            if (examName.equals(exams.get(i).getName())) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            exams.remove(indexToRemove);
        }

    }

    public LevelOfDegree getLevelOfDegree() {
        return levelOfDegree;
    }

    public void setLevelOfDegree(LevelOfDegree levelOfDegree) {
        this.levelOfDegree = levelOfDegree;
    }

    public HumanInfo getInfo() {
        return info;
    }

    public void setInfo(HumanInfo info) {
        this.info = info;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
