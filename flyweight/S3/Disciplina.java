package practice.flyweight.S3;

public class Disciplina implements IDisciplina{
    private String denumire;
    private int nrPuncteCredit;

    public Disciplina(String denumire, int nrPuncteCredit) {
        this.denumire = denumire;
        this.nrPuncteCredit = nrPuncteCredit;
    }

    @Override
    public void descriere() {
        System.out.println("Disciplina: " + denumire + " cu nr credit: " + nrPuncteCredit);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "denumire='" + denumire + '\'' +
                ", nrPuncteCredit=" + nrPuncteCredit +
                '}';
    }
}
