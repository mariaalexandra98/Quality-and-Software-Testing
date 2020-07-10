package practice.chainOfResponsability.practice;

public class AngajatorProgramator extends Angajator{
    @Override
    public void angajare(Candidat candidat) {
        if(candidat.isAreCompetenteTestare() && candidat.isAreCompetenteProgramare()) {
            System.out.println("Candidatul " + candidat.getNume() + "a fost angajat pe postul de programator");
        } else{
            this.getNextAngajator().angajare(candidat);
        }
    }
}
