package practice.adapter.s12;

public class TestareAdapter {
    public static void main(String[] args) {
        IProcesareEveniment sistemLocal = new SistemLocalDeAlertare();
        sistemLocal.transmitereMesaj(TipEveniment.INCENDIU, "sistem local de alertare", 2);

        IAlertarePublica alertarePublica = new SistemNationalDeAlertare();
        alertarePublica.alertaIncendiu("alertare publica", 3);

        AdaptorSistemLocal adaptorSistemLocal = new AdaptorSistemLocal(sistemLocal);
        adaptorSistemLocal.alertaIncendiu("Agiutor", 1);


    }
}
