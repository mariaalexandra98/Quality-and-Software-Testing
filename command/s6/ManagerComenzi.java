package command.s6;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<IGlovo> comenzi;

    public ManagerComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(IGlovo comanda) {
        comenzi.add(comanda);
    }

    public void executaOComanda(String listaCumparaturi) {
        if(comenzi.size() > 0) {
            comenzi.get(0).getListaCumparaturi(listaCumparaturi);
            comenzi.remove(0);
        }
    }

    public void executaToateComenzile(String listaCumparaturi) {
        for(IGlovo comanda : comenzi) {
            comanda.getListaCumparaturi(listaCumparaturi);
        }
    }
}
