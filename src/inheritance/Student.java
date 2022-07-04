package inheritance;
// класс Студентов
public class Student {
    // переменные класса
    private String firstName, lastName, group;
    double averageMark;

    public Student (String pfirstName, String plastName, String pgroup, double pAverageMark) {
        firstName = pfirstName;
        lastName = plastName;
        group = pgroup;
        averageMark = pAverageMark;
    }

    public Student() {
            System.out.println("Конструктор студентов");
        }

    // метод getScholarship() для класса Student возвращает сумму стипендии
    public int getScholarship() {
        final int pay = (averageMark == 5) ? 100 : 80;
        System.out.println("Сумма стипендии " + pay);
        return pay;
    }
}

