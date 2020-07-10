package practice.observer.S10;

public class Locatar implements ILocatar {
    private String nume;

    public Locatar(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesajAdministratie(String mesaj, int numarBloc) {
        System.out.println("Locatarul " + nume + " a primit mesajul " + mesaj + " pentru blocul " + numarBloc);
    }
}
