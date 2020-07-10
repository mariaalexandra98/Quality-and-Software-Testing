package practice.strategy.practice;

public class Pacient {
    private String nume;
    private IModalitatePlata modalitatePlata;

    public void setModalitatePlata(IModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public Pacient(String nume) {
        this.nume = nume;
        this.modalitatePlata = new Card();
    }

    public void plateste(double suma) {
        modalitatePlata.realizeazaPlata(nume, suma);
    }
}
