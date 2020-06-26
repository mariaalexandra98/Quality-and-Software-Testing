package command.practice;

public class TestareCommand {
    public static void main(String[] args) {
        IMedic medic = new Medic("Popescu Andrei", "chirurg");
        ManagerComenzi managerComenzi = new ManagerComenzi();

        IComanda comanda1 = new ComandaInternare(medic, "Carmen Vasile");
        IComanda comanda2 = new ComandaTratare(medic, "Petrescu Andrei");

        managerComenzi.adauga(comanda1);
        managerComenzi.adauga(comanda2);

        managerComenzi.executaToateComenzile();
    }
}
