package practice.chainOfResponsability.practice;

public class Candidat {
    private String nume;
    private boolean areCompetenteManageriale;
    private boolean areCompetenteProgramare;
    private boolean areCompetenteTestare;

    public Candidat(String nume, boolean areCompetenteManageriale, boolean areCompetenteProgramare, boolean areCompetenteTestare) {
        this.nume = nume;
        this.areCompetenteManageriale = areCompetenteManageriale;
        this.areCompetenteProgramare = areCompetenteProgramare;
        this.areCompetenteTestare = areCompetenteTestare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreCompetenteManageriale() {
        return areCompetenteManageriale;
    }

    public boolean isAreCompetenteProgramare() {
        return areCompetenteProgramare;
    }

    public boolean isAreCompetenteTestare() {
        return areCompetenteTestare;
    }
}
