package practice.chainOfResponsability.s4;

public class Tren extends MijlocDeTransport {
    @Override
    public void transporta(ICalator calator, int nrKm) {
        System.out.println("Transport cu trenul");
        calator.deplaseaza(nrKm);
    }
}
