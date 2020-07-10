package practice.command.s5;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<IComanda> listaComenzi;

    public ManagerComenzi() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(IComanda comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComenzile() {
        for(IComanda comanda : listaComenzi) {
            comanda.executa();
        }
        listaComenzi.removeAll(listaComenzi);
    }
}
