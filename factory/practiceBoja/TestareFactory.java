package practice.factory.practiceBoja;

public class TestareFactory {
    public static void main(String[] args) {
        CaracterAbstract personajNegativ = FactoryCaractere.creareCaracter("Superman", TipCaracter.NEGATIV);
        CaracterAbstract personajPozitiv = FactoryCaractere.creareCaracter("Joker", TipCaracter.POZITIV);
        personajNegativ.afisareEcran();
        personajPozitiv.afisareEcran();
    }
}
