package practice.factory.S5;

public class TestareFactory {
    public static void main(String[] args) {
        IFinanciar tranzactieCrypto = FactoryTranzactie.creazaTranzatie(TipTranzactie.CRYPTOMONEDA, "bani pentru o Tesla smek");
        IFinanciar tranzactieSchimbValutar = FactoryTranzactie.creazaTranzatie(TipTranzactie.SCHIMB_VALUTAR, "tranzactie schimb valutar");

        tranzactieCrypto.executaTranzactie(200);
        tranzactieSchimbValutar.executaTranzactie(100);

    }
}
