package practice.observer.s9;

public class TestareObserver {
    public static void main(String[] args) {
        Client client = new Client("Popescu Andrei");
        Client client1 = new Client("Cojocaru Maria");

        Grup grupStudiu = new Grup();
        Grup grupColegiLiceu = new Grup();

        grupStudiu.abonareObserver(client);
        grupColegiLiceu.abonareObserver(client1);
        grupColegiLiceu.abonareObserver(client);

        grupStudiu.notifica("Salut!");
        grupColegiLiceu.notifica("Cmf");

        grupColegiLiceu.dezabonareObserver(client);
        grupColegiLiceu.notifica("De ce a iesit din grup " + client.getNume() + " ?");
    }
}
