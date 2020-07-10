package practice.decorator.s1;

import java.util.Date;

public class User implements IActiuniEmail {
    private String nume;

    public User(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        System.out.println("Trimitere email catre " + destinatie + " cu subiectul " + subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println("Creare draft emil cu sub "+ subject + " si prioritatea "+ prioritate);
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println("Creare draft emil cu sub "+ subject + " si prioritatea " + destinatie);
    }
}
