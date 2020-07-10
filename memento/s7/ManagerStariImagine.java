package practice.memento.s7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ManagerStariImagine {
    HashMap<String, ImagineBitmapMemento> lista;

    public ManagerStariImagine() {
        lista = new HashMap<>();
    }

    public void backUp(ImagineBitmapMemento imagineBitmapMemento, String data) {
        lista.put(data, imagineBitmapMemento);
    }

    public ImagineBitmapMemento restore(String data) {
        return lista.get(data);
    }
}
