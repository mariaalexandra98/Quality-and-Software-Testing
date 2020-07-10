package practice.chainOfResponsability.practice;

public abstract class Angajator {
    private Angajator nextAngajator;
    public Angajator getNextAngajator() {
        return this.nextAngajator;
    }

    public void setAngajator(Angajator angajator) {
        this.nextAngajator = angajator;
    }

    public abstract void angajare(Candidat candidat);

}
