package command.s11;

public class TestareCommandS11 {
    public static void main(String[] args) {
        IReparatie electrician = new Electrician();
        IReparatie instalator = new Instalator();

        RezolvareProblema problema = new RezolvareProblema("Popescu Andrei", "123", 12, "problema la instalatia de la dus",
                instalator);
        RezolvareProblema problema1 = new RezolvareProblema("Coman Mihai", "123", 2, "problema la becuri",
                electrician);

        ManagerProbleme managerProbleme = new ManagerProbleme();
        managerProbleme.adauga(problema);
        managerProbleme.adauga(problema1);
        managerProbleme.executaToateLucrarile("123", 2, "problema la becuri");
    }
}
