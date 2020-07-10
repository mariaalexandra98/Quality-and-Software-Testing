package practice.command.s6;

public class TestareCommand {
    public static void main(String[] args) {
        Curier curier = new Curier("Vasile Popescu", 2);
        Curier curier1 = new Curier("Damian Anton", 4);

        IGlovo comanda1 = new Comanda(curier1,"MC", 34);
        IGlovo comanda2 = new Comanda(curier,"MC", 45);

        ManagerComenzi managerComenzi = new ManagerComenzi();
        managerComenzi.adaugaComanda(comanda1);
        managerComenzi.adaugaComanda(comanda2);

        managerComenzi.executaToateComenzile("meniuri");
    }
}
