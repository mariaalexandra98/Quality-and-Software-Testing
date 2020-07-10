package practice.chainOfResponsability.s12;

public class Eveniment implements IProcesareEveniment {
    @Override
    public void transmitereMesaj(TipEveniment tip, String detalii, float probabilitate) {
        System.out.println("Se transmite mesajul " + detalii + " pt tipul " + tip + " si probabilitatea de " + probabilitate);
    }
}
