package practice.composite.practice;

public class Medicament implements Nod {
    String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Nod categorie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereNod(Nod categorie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Nod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void descriere(String indentare) {
        System.out.println("Medicament: " + denumire);
    }
}
