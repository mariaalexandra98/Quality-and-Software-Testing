package practice.factory.S5;

public class SchimbValutar implements IFinanciar {
    private String denumire;

    public SchimbValutar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void executaTranzactie(float suma) {
        System.out.println("Schimba valutar " + denumire + " suma de " + suma);
    }

    @Override
    public void afisareDateTranzactie(TipTranzactie tipTranzactie, String denumire) {
        System.out.println("Tranzactia " + tipTranzactie + " cu denumirea " + denumire);
    }
}
