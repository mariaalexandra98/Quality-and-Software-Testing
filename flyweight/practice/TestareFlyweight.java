package practice.flyweight.practice;

public class TestareFlyweight {
    public static void main(String[] args) {
        IClient client = ClientFactory.creareClient("Popescu Andrei", 123456L);
        Reteta reteta = new Reteta(10, 123, 3);
        IClient client2 = ClientFactory.creareClient("Popescu Laur", 99999L);
        Reteta reteta2 = new Reteta(30, 1333, 23);

        client.desceiere(reteta);
        client2.desceiere(reteta2);

    }
}
