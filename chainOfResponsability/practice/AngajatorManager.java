package practice.chainOfResponsability.practice;

public class AngajatorManager extends Angajator {

    @Override
    public void angajare(Candidat candidat) {
        if(candidat.isAreCompetenteManageriale() &&
        candidat.isAreCompetenteProgramare()
        && candidat.isAreCompetenteTestare()) {
            System.out.println("Candidatul " + candidat.getNume() + " a fost angajat pe pozitia de manager");
        } else{
            this.getNextAngajator().angajare(candidat);
        }
    }
}
