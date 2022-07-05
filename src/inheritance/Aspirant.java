package inheritance;
// класс Аспирантов
public class Aspirant extends Student {
    String scienceWork; // наличие научной работы
    public String setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
        return scienceWork;
    }
    // конструктор аспирантов (аспирант - это студент с научной работой)
    public Aspirant(String pfirstName, String plastName, String pgroup, double pAverageMark, String pScienceWork)
    {
        super(pfirstName, plastName, pgroup, pAverageMark);
        scienceWork = setScienceWork(pScienceWork);
    }
    @Override
    public int getScholarship() {
        scholarship = (averageMark == 5) ? 200 : 180;
        return scholarship;
    }
    @Override
    public String displayStudentInfo(){
        return firstName + " " + lastName + ", " + group + ", ср.оценка " + averageMark + ", стипендия " + getScholarship() + "\nРабота \"" + scienceWork + "\"\n";
    }
}