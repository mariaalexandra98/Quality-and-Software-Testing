package practice.proxy.practice;

public class Pacient {
    private String nume;
    private boolean esteAsigurat;

    public Pacient(String nume, boolean esteAsigurat) {
        this.nume = nume;
        this.esteAsigurat = esteAsigurat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteAsigurat() {
        return esteAsigurat;
    }
}
