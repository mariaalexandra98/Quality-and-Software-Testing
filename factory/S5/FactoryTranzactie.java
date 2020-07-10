package practice.factory.S5;

public class FactoryTranzactie {
    public static IFinanciar creazaTranzatie(TipTranzactie tipTranzactie, String denumire) {
        switch (tipTranzactie) {
            case CRYPTOMONEDA:
                return new Cryptomoneda(denumire);
            case SCHIMB_VALUTAR:
                return new SchimbValutar(denumire);
            default:
                return null;
        }
    }
}
