package practice.strategy.s3;

public class Student {
    private String numeStudent;
    private int varsta;
    private IStudent modalitateSustinereExamen;

    public Student(String numeStudent, int varsta, IStudent modalitateSustinereExamen) {
        this.numeStudent = numeStudent;
        this.varsta = varsta;
        this.modalitateSustinereExamen = modalitateSustinereExamen;
    }

    public void setModalitateSustinereExamen(IStudent modalitateSustinereExamen) {
        this.modalitateSustinereExamen = modalitateSustinereExamen;
    }

    public void executaStrategieSustinereExamen(String disciplina) {
        modalitateSustinereExamen.sustineExamen(disciplina);
    }
}
