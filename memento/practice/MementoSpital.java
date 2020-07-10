package practice.memento.practice;

public class MementoSpital {
    int nrSpital;
    int nrMedici;

    public MementoSpital(int nrSpital, int nrMedici) {
        this.nrSpital = nrSpital;
        this.nrMedici = nrMedici;
    }

    public int getNrSpital() {
        return nrSpital;
    }

    public int getNrMedici() {
        return nrMedici;
    }
}
