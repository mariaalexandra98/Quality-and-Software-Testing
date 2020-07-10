package practice.chainOfResponsability.s12;

public abstract class MesajSenzorAbstract {
    private MesajSenzorAbstract nextMesaj;

    public MesajSenzorAbstract getNextMesaj() {
        return nextMesaj;
    }

    public void setNextMesaj(MesajSenzorAbstract nextMesaj) {
        this.nextMesaj = nextMesaj;
    }

    public abstract void notificaSituatie(IProcesareEveniment procesareEveniment, TipEveniment tip, String detalii, float probabilitate);
}
