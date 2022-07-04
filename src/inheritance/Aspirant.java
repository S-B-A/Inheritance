package inheritance;
// класс Аспирантов
public class Aspirant extends Student {
    String scienceWork; // наличие научной работы
    public String setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
        return scienceWork;
    }
    // конструктор аспирантов (аспирант - это студент с научной работой)
    Aspirant(String pfirstName, String plastName, String pgroup, double pAverageMark, String pScienceWork){
        super();
        firstName = pfirstName;
        lastName = plastName;
        group = pgroup;
        averageMark = pAverageMark;
        scienceWork = setScienceWork(pScienceWork);
    }
}