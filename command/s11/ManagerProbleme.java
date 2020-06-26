package command.s11;

import java.util.ArrayList;
import java.util.List;

public class ManagerProbleme {
    private List<RezolvareProblema> probleme;

    public ManagerProbleme() {
        this.probleme = new ArrayList<>();
    }

    public void adauga(RezolvareProblema problema) {
        this.probleme.add(problema);
    }

    public void executaToateLucrarile(String nrBloc, int nrAp, String prob) {
        for(RezolvareProblema rezolvareProblema : probleme) {
            rezolvareProblema.reparaProblemaInBloc(nrBloc, nrAp, prob);
        }
    }
}
