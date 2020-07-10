package practice.command.practice;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<IComanda> comenzi;

    public ManagerComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void adauga(IComanda comanda) {
        if(comanda != null) {
            comenzi.add(comanda);
        }
    }

    public void executaComanda() {
        if(comenzi.size() > 0) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }

    public void executaToateComenzile() {
        for(IComanda comanda : comenzi) {
            comanda.executa();
        }
        comenzi.removeAll(comenzi);
    }
}
