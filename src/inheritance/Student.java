package inheritance;
// класс Студентов
public class Student {
    // переменные класса
    String firstName, lastName, group;
    double averageMark;
    protected int scholarship;

    public Student (String pfirstName, String plastName, String pgroup, double pAverageMark) {
        firstName = pfirstName;
        lastName = plastName;
        group = pgroup;
        averageMark = pAverageMark;
    }

    public int getScholarship() {
        scholarship = (averageMark == 5) ? 100 : 80;
        return scholarship;
    }
}