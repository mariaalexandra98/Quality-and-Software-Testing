package practice.adapter.s12;

public class AdaptorSistemLocal implements IAlertarePublica{
    private IProcesareEveniment procesareEveniment;

    public AdaptorSistemLocal(IProcesareEveniment procesareEveniment) {
        this.procesareEveniment = procesareEveniment;
    }

    @Override
    public void alertaIncendiu(String detalii, float probabilitate) {
        procesareEveniment.transmitereMesaj(TipEveniment.INCENDIU, detalii, probabilitate);
    }

    @Override
    public void alertaInundatie(String detalii, float probabilitate) {
        procesareEveniment.transmitereMesaj(TipEveniment.INUNDATIE, detalii, probabilitate);
    }

    @Override
    public void informare(String detalii, float probabilitate) {
        procesareEveniment.transmitereMesaj(TipEveniment.INFORMARE, detalii, probabilitate);
    }
}
