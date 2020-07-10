package practice.strategy.s3;

public class TestGrila implements IStudent {
    @Override
    public void sustineExamen(String displina) {
        System.out.println("Sustinere examen grila la disciplina " + displina);
    }
}
