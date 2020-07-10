package practice.flyweight.practice;

public class Reteta {
    private int nrReteta;
    private float sumaPlata;
    private int nrMedicamente;

    public Reteta(int nrReteta, float sumaPlata, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", sumaPlata=" + sumaPlata +
                ", nrMedicamente=" + nrMedicamente +
                '}';
    }
}
