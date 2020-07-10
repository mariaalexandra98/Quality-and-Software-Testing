package practice.chainOfResponsability.s12;

public class Inundatie extends MesajSenzorAbstract {
    @Override
    public void notificaSituatie(IProcesareEveniment procesareEveniment, TipEveniment tip, String detalii, float probabilitate) {
        if(tip == TipEveniment.INUNDATIE) {
            System.out.println("Notifica admin!");
            procesareEveniment.transmitereMesaj(tip, detalii, probabilitate);
        } else{
            this.getNextMesaj().notificaSituatie(procesareEveniment, tip, detalii, probabilitate);
        }
    }
}
