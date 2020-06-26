package composite.s10;

public class Locatar extends LocatarAbstract {
    private String nume;

    public Locatar(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesajAdministratie(String mesaj, String numarBloc) {
        System.out.println("Locatarul " + nume + " a primit mesajul " + mesaj + " si are numarul de bloc " + numarBloc);
    }

    @Override
    public void platesteIntretinere(Double sumaDePlata) {
        System.out.println("Locatarul " + nume + "plateste intretinerea in valoare de " + sumaDePlata);
    }

}
