package practice.memento.practice;

import java.util.ArrayList;
import java.util.List;

public class ManageriStariSpital {
    List<MementoSpital> lista;

    public ManageriStariSpital() {
        this.lista = new ArrayList<>();
    }

    public void addBackup(MementoSpital mementoSpital) {
        lista.add(mementoSpital);
    }

    public MementoSpital getMemento(int pozitie) {
        if(pozitie >= 0 && pozitie <= lista.size()) {
            return lista.get(pozitie);
        }else{
            return null;
        }
    }
}
