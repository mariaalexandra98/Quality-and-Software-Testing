package command.s5;

public class TestareCommandS5 {
    public static void main(String[] args) {
        IClientBursa client = new Client("Popescu Gabriel");
        IClientBursa client1 = new Client("Vasile Cosmin");

        ManagerComenzi managerComenzi = new ManagerComenzi();
        IComanda comanda = new ComandaCumparare(client, "procesata", "comandata", "abc", 123);
        IComanda comanda1 = new ComandaCumparare(client, "neporcesata", "vanzare", "xyz", 23);
        IComanda comanda2 = new ComandaCumparare(client1, "procesata", "comandata", "abc", 123);

        managerComenzi.adaugaComanda(comanda);
        managerComenzi.adaugaComanda(comanda1);
        managerComenzi.adaugaComanda(comanda2);
        managerComenzi.executaComenzile();

    }
}
