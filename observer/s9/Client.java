package practice.observer.s9;

public class Client implements ITransmitereMesaj {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void primireMesaj(String user, String mesaj) {
        System.out.println("Clientul " + user + " a primit mesajul " + mesaj);
    }
}
