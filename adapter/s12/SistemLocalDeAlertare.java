package practice.adapter.s12;

public class SistemLocalDeAlertare implements IProcesareEveniment {

    @Override
    public void transmitereMesaj(TipEveniment tip, String detalii, float probabilitate) {
        System.out.println("Alerta locala de tipul " + tip + " cu detaliile " + detalii + " si probabilitatea de " + probabilitate);
    }
}
