package practice.flyweight.S3;

public class Student implements ISustineExamen{
    private String nume;
    private int anStudiu;

    public Student(String nume, int anStudiu) {
        this.nume = nume;
        this.anStudiu = anStudiu;
    }

    @Override
    public void sustineExamen(IDisciplina disciplina) {
        System.out.println("Studentul " + nume + " sustine ex la " + disciplina.toString());
    }
}
