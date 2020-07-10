package practice.chainOfResponsability.practice;

public class AngajatorTester extends Angajator{
    @Override
    public void angajare(Candidat candidat) {
        if(candidat.isAreCompetenteTestare()) {
            System.out.println("Candidatul " + candidat.getNume() + " a fost anagajat pe pozitia de tester");
        } else{
            System.out.println("Candidatul nu poate fi angajat");
        }
    }
}
