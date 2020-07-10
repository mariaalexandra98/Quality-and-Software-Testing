package practice.flyweight.practice;

import java.util.HashMap;

public class ClientFactory {
    private static HashMap<Long, IClient> clienti = new HashMap<>();

    public static IClient creareClient(String nume, Long nrAsigurare) {
        IClient client = clienti.get(nrAsigurare);
        if(client == null) {
            client = new Client(nume, nrAsigurare);
            clienti.put(nrAsigurare, client);
        }
        return client;
    }
}
