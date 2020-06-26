package composite.s1;

import java.util.Date;

public class PersonalaEmail extends NodEmail implements IActiuniEmail{
    private String email;
    private int varsta;
    private boolean esteActiv;

    public PersonalaEmail(String denumire, String email, int varsta, boolean esteActiv) {
        super(denumire);
        this.email = email;
        this.varsta = varsta;
        this.esteActiv = esteActiv;
    }

    @Override
    void adaugaCategorie(NodEmail categorie) {
        throw new UnsupportedOperationException();
    }

    @Override
    void eliminaCategorie(NodEmail categorie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        System.out.println("Trimitere email catre " + destinatie + " cu subiectul " + subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println("Creare draft cu subiectul " + subject + " si prioritatea " + prioritate);
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {

    }
}
