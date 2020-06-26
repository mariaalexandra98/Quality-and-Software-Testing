package command.s5;

public class ComandaCumparare implements IComanda {
    private IClientBursa clientBursa;
    private String stare;
    private String tip;
    private String codActiuni;
    private int nrActiuni;

    public ComandaCumparare(IClientBursa clientBursa, String stare, String tip, String codActiuni, int nrActiuni) {
        this.clientBursa = clientBursa;
        this.stare = stare;
        this.tip = tip;
        this.codActiuni = codActiuni;
        this.nrActiuni = nrActiuni;
    }

    @Override
    public void executa() {
        this.clientBursa.cumpara(codActiuni, nrActiuni);
    }
}
