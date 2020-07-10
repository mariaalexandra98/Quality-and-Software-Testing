package practice.memento.s7;

public class ImagineBitmapConcreta extends ImagineBitmap implements IImagineBitmap {
    protected String denumire;

    public ImagineBitmapConcreta(int latime, int lungime, String schemaCulori, float dimensiune, String denumire) {
        super(latime, lungime, schemaCulori, dimensiune);
        this.denumire = denumire;
    }

    @Override
    public void redimensionare(int nouaLatime, int nouaLungime) {
        System.out.println("Redimensionare magine cu masuri de" + nouaLatime + " si " + nouaLungime);
    }

    @Override
    public void modificaSchemaCulori(String schemaCulori) {
        System.out.println("Schema de culori de " + schemaCulori);
    }

    @Override
    public void redenumesteFisier() {
        System.out.println("Fisierul a fost redenumit");
    }

    @Override
    public void adaugaText() {
        System.out.println("Adaugare text");
    }

    @Override
    public void afisareImagine() {
        System.out.println("Afisare imagine: latime: " + latime + " lungime: " + lungime +
                " schema culori: " + schemaCulori + " dimensiune " + dimensiune + " denumire: " + denumire);
    }

    @Override
    public ImagineBitmapMemento salvareStare() {
        ImagineBitmapMemento imagineBitmapMemento = new ImagineBitmapMemento(latime, lungime, schemaCulori, dimensiune);
        return imagineBitmapMemento;
    }

    @Override
    public void recuperareStareImagineBitmap(ImagineBitmapMemento imagineBitmapMemento) {
        this.lungime = imagineBitmapMemento.lungime;
        this.latime = imagineBitmapMemento.latime;
        this.dimensiune = imagineBitmapMemento.dimensiune;
        this.schemaCulori = imagineBitmapMemento.schemaCulori;
    }
}
