package composite.s1;

public abstract class NodEmail {
    private String denumire;

    public NodEmail(String denumire) {
        this.denumire = denumire;
    }

    abstract void adaugaCategorie(NodEmail categorie);
    abstract void eliminaCategorie(NodEmail categorie);
}
