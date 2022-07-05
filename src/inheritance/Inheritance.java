/*
Задание: создать пример наследования.

Порядок выполнения:

Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.

Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.

Создайте переменную типа Student, которая ссылается на объект типа Aspirant.

Создайте метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5 баллам, то сумма 100 р, иначе 80 р.

Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5 баллам, то сумма 200 р, иначе 180 р.

Создайте массив типа Student, содержащий объекты класса Student и Aspirant. Вызовите метод getScholarship() для каждого элемента массива.
 */
package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        //Student scholar1 = new Aspirant("Саша", "Берг", "аспирант", 3.5, "Сетевое планирование на проихзводстве");
        //System.out.println(scholar1.firstName + scholar1.lastName+ scholar1.averageMark+ scholar1.setScholarship()+"\n");
        Student[] scholar = new Student[6];
        scholar[0] = new Student("Иван", "Иванов", "студент", 5.0);
        scholar[1] = new Student("Пётр", "Степанов", "студент", 4.85);
        scholar[2] = new Student("Мария", "Фёдорова", "студент", 5);
        scholar[3] = new Student("Семён", "Альтов", "студент", 3.7);
        scholar[4] = new Aspirant("Георгий", "Гришин", "аспирант", 4.9, "Проблемы развития мышиных детёнышей в присутствии львов.");
        scholar[5] = new Aspirant("Екатерина", "Буракова", "аспирант", 5, "Characterisation of conformational heterogeneity via higher-dimentional proton-detected solid-state NMR");
        for (Student scholars: scholar)
        {
            System.out.println(scholars.firstName + " " + scholars.lastName + ", " + scholars.group + ", средняя оценка " + scholars.averageMark + ", стипендия " + scholars.getScholarship());
        }
    }
}