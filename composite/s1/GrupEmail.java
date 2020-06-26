package composite.s1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrupEmail extends NodEmail implements IActiuniEmail {
    private List<NodEmail> listaPersoane;
    public GrupEmail(String denumire) {
        super(denumire);
        listaPersoane = new ArrayList<>();
    }

    @Override
    void adaugaCategorie(NodEmail categorie) {
        listaPersoane.add(categorie);
    }

    @Override
    void eliminaCategorie(NodEmail categorie) {
        listaPersoane.remove(categorie);
    }


    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getEmail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        throw new UnsupportedOperationException();
    }
}
