package practice.observer.S10;

import practice.memento.s14.IApartament;

import java.util.ArrayList;
import java.util.List;

public class Administrator implements IAdministrator {
    private List<ILocatar> locatariObservabili;
    int nrBloc;

    public Administrator(int nrBloc) {
        this.nrBloc = nrBloc;
        locatariObservabili = new ArrayList<>();
    }

    @Override
    public void notifica(String mesaj) {
        for(ILocatar locatar : locatariObservabili) {
            locatar.primesteMesajAdministratie(mesaj, nrBloc);
        }
    }

    @Override
    public void abonareObservator(ILocatar locatar) {
        locatariObservabili.add(locatar);
    }

    @Override
    public void dezabonareObservator(ILocatar locatar) {
        locatariObservabili.remove(locatar);
    }
}
