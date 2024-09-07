package lab1;

public class Main {
    public static void main(String[] args) {
        HumanInfo infoOfStudent1 = new HumanInfo("Oleg", "Shelonov", new Date(26, 9, 2000));
        Exam exam1 = new Exam("Math", 100, new Date(26, 7, 2024));
        Exam exam2 = new Exam("English", 60, new Date(3, 8, 2024));
        Exam exam3 = new Exam("Programming", 95, new Date(10, 7, 2024));
        Student student1 = new Student(LevelOfDegree.MASTER, infoOfStudent1);
        student1.addExam(exam1);
        student1.addExam(exam2);
        student1.addExam(exam3);

        System.out.println("Student1 full info");
        student1.printInfo();
        System.out.println("_________________________");

        System.out.println("Student1 shortened info");
        student1.printShortInfo();
        System.out.println("_________________________");

        HumanInfo humanInfo = student1.getInfo();
        System.out.println("Student1 info via getter: ");
        humanInfo.printInfo();
        System.out.println("_________________________");

        HumanInfo infoOfStudent2 = new HumanInfo("Diana", "Stenford", new Date(31, 8, 2004));
        Exam exam4 = new Exam("Math", 100, new Date(26, 7, 2024));
        Exam exam5 = new Exam("English", 80, new Date(3, 8, 2024));
        Student student2 = new Student(LevelOfDegree.BACHELOR, infoOfStudent2);
        student2.addExam(exam4);
        student2.addExam(exam5);

        System.out.println("Student2 full info");
        student2.printInfo();
        System.out.println("_________________________");

        System.out.println("Student2 shortened info");
        student2.printShortInfo();
        System.out.println("_________________________");

        HumanInfo humanInfo2 = student2.getInfo();
        System.out.println("Student2 info via getter: ");
        humanInfo2.printInfo();
    }
}
