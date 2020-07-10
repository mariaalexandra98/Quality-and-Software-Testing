package practice.command.s5;

public class ComandaVanzare implements IComanda {
    private IClientBursa clientBursa;
    private String stare;
    private String tip;
    private String codActiuni;
    private int nrActiuni;

    public ComandaVanzare(IClientBursa clientBursa, String stare, String tip, String codActiuni, int nrActiuni) {
        this.clientBursa = clientBursa;
        this.stare = stare;
        this.tip = tip;
        this.codActiuni = codActiuni;
        this.nrActiuni = nrActiuni;
    }

    @Override
    public void executa() {
        clientBursa.vinde(codActiuni, nrActiuni);
    }
}
