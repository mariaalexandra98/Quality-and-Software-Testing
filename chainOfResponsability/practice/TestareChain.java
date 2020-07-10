package practice.chainOfResponsability.practice;

public class TestareChain {
    public static void main(String[] args) {
        Angajator manager = new AngajatorManager();
        Angajator tester = new AngajatorTester();
        Angajator programator = new AngajatorProgramator();

        manager.setAngajator(programator);
        programator.setAngajator(tester);

        Candidat candidat = new Candidat("Popescu Andrei", false, true, true);
        manager.angajare(candidat);
    }
}
