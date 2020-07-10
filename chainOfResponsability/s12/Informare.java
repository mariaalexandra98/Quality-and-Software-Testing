package practice.chainOfResponsability.s12;

public class Informare extends MesajSenzorAbstract {
    @Override
    public void notificaSituatie(IProcesareEveniment procesareEveniment, TipEveniment tip, String detalii, float probabilitate) {
        if(tip == TipEveniment.INFORMARE) {
            System.out.println("Notifica locatari");
            procesareEveniment.transmitereMesaj(tip, detalii, probabilitate);
        } else{
            this.getNextMesaj().notificaSituatie(procesareEveniment, tip, detalii, probabilitate);
        }
    }
}
