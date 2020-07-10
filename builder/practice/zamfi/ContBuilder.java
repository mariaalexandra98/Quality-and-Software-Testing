package practice.builder.practice.zamfi;

public class ContBuilder implements IBuilder{
    private Cont cont;

    public ContBuilder() {
        cont = new Cont();
    }

    public ContBuilder setTitular(String titular) {
        cont.setTitular(titular);
        return this;
    }

    public ContBuilder setEsteContSalariu(boolean esteContSalariu) {
        this.cont.setEsteContSalariu(esteContSalariu);
        return this;
    }

    public ContBuilder setAreCardAtasat(boolean areCardAtasat) {
        this.cont.setAreCardAtasat(areCardAtasat);
        return this;
    }

    public ContBuilder areInternetBanking(boolean areInternetBanking) {
        this.cont.setAreInternetBanking(areInternetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}

