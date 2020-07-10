package practice.observer.s9;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IGrupObserver {
    private List<Client> clientiObservabili;

    public Grup() {
        clientiObservabili = new ArrayList<>();
    }

    @Override
    public void abonareObserver(Client observer) {
        clientiObservabili.add(observer);
    }

    @Override
    public void dezabonareObserver(Client observer) {
        clientiObservabili.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for(Client observer : clientiObservabili) {
            observer.primireMesaj(observer.getNume(), mesaj);
        }
    }
}
