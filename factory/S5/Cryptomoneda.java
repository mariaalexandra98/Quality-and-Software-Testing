package practice.factory.S5;

public class Cryptomoneda implements IFinanciar{
    private String denumire;

    public Cryptomoneda(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void executaTranzactie(float suma) {
        System.out.println("Plata crypromoneda prin " + denumire + " suma de " + suma);
    }

    @Override
    public void afisareDateTranzactie(TipTranzactie tipTranzactie, String denumire) {
        System.out.println("Tranzactia " + tipTranzactie + " cu denumirea " + denumire);
    }
}
