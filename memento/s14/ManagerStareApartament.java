package practice.memento.s14;

import practice.memento.practice.ManageriStariSpital;

import java.util.ArrayList;
import java.util.List;

public class ManagerStareApartament {
    private List<ApartmentMemento> lista;

    public ManagerStareApartament() {
        lista = new ArrayList<>();
    }

    public void addBackup(ApartmentMemento apartmentMemento) {
        lista.add(apartmentMemento);
    }

    public ApartmentMemento getStare(int luna) {
        if(luna >= 0 && luna <= 12) {
            return lista.get(luna);
        }
        return null;
    }
}
