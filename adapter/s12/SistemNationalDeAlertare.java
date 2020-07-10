package practice.adapter.s12;

public class SistemNationalDeAlertare implements IAlertarePublica{
    @Override
    public void alertaIncendiu(String detalii, float probabilitate) {
        System.out.println("Alerta incendiu " + detalii +  " si probabilitate de " + probabilitate);
    }

    @Override
    public void alertaInundatie(String detalii, float probabilitate) {
        System.out.println("Alerta de indundatie " + detalii + " si probabilitatea de " + probabilitate);
    }

    @Override
    public void informare(String detalii, float probabilitate) {
        System.out.println("Alerta de informare " + detalii + " si probabilitatea de " + probabilitate);
    }
}
