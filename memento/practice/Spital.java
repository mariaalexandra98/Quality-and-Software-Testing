package practice.memento.practice;

public class Spital implements ISpital {
    private String nume;
    private int nrPacienti;
    private int nrMedici;

    public Spital(String nume, int nrPacienti, int nrMedici) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
        this.nrMedici = nrMedici;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPacienti() {
        return nrPacienti;
    }

    public void setNrPacienti(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    public void setNrMedici(int nrMedici) {
        this.nrMedici = nrMedici;
    }

    @Override
    public MementoSpital salveazaStare() {
        MementoSpital mementoSpital = new MementoSpital(this.nrPacienti, this.nrMedici);
        return mementoSpital;
    }

    @Override
    public void recuperareStare(MementoSpital mementoSpital) {
        this.nrMedici = mementoSpital.nrMedici;
        this.nrPacienti = mementoSpital.nrSpital;
    }

    @Override
    public String toString() {
        return "Spital{" +
                "nume='" + nume + '\'' +
                ", nrPacienti=" + nrPacienti +
                ", nrMedici=" + nrMedici +
                '}';
    }
}
