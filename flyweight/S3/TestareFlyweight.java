package practice.flyweight.S3;

public class TestareFlyweight {
    public static void main(String[] args) {
        ISustineExamen student1 = new Student("Andrei", 1);
        ISustineExamen student2 = new Student("Maria", 3);
        ISustineExamen student3 = new Student("Dragos", 2);

        IDisciplina disciplina = FlyweightDisciplina.sustineExamen(5, "cts");
        IDisciplina disciplina2 = FlyweightDisciplina.sustineExamen(4, "pachete soft");
        IDisciplina disciplina3 = FlyweightDisciplina.sustineExamen(2, "analiza datelor");

        student1.sustineExamen(disciplina);
        student2.sustineExamen(disciplina);
        student1.sustineExamen(disciplina3);
        student1.sustineExamen(disciplina2);
    }
}
