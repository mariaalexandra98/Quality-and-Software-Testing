package practice.chainOfResponsability.s12;

public class TestChainS12 {
    public static void main(String[] args) {
        MesajSenzorAbstract alarmaIncendiu = new AlarmaIncendiu();
        MesajSenzorAbstract informare = new Informare();
        MesajSenzorAbstract inundatie = new Inundatie();

        alarmaIncendiu.setNextMesaj(inundatie);
        inundatie.setNextMesaj(informare);

        IProcesareEveniment eveniment = new Eveniment();
        alarmaIncendiu.notificaSituatie(eveniment, TipEveniment.INFORMARE, "valeleu", 3);
    }
}
