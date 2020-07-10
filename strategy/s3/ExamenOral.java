package practice.strategy.s3;

public class ExamenOral implements IStudent {
    @Override
    public void sustineExamen(String displina) {
        System.out.println("Sustinere examen oral la disciplina " + displina);
    }
}
