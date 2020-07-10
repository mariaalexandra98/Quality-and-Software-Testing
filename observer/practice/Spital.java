package practice.observer.practice;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private List<IPacient> pacientiObservabili;

    public Spital() {
        pacientiObservabili = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IPacient pacient) {
        pacientiObservabili.add(pacient);
    }

    @Override
    public void stergeObserve(IPacient pacient) {
        pacientiObservabili.remove(pacient);
    }

    @Override
    public void notifica(String mesaj) {
        for(IPacient pacient : pacientiObservabili) {
            pacient.receptionareMesaj(mesaj);
        }
    }
}
