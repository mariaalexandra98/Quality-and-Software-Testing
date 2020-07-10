package practice.chainOfResponsability.s12;

public class AlarmaIncendiu extends MesajSenzorAbstract {

    @Override
    public void notificaSituatie(IProcesareEveniment procesareEveniment, TipEveniment tip, String detalii, float probabilitate) {
        if(tip == TipEveniment.INCENDIU) {
            System.out.println("Suna 112!");
            procesareEveniment.transmitereMesaj(tip, detalii, probabilitate);
        } else{
            this.getNextMesaj().notificaSituatie(procesareEveniment, tip, detalii, probabilitate);
        }
    }
}
