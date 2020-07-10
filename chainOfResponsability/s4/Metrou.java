package practice.chainOfResponsability.s4;

public class Metrou extends MijlocDeTransport {
    @Override
    public void transporta(ICalator calator, int nrKm) {
        if(nrKm <= 15) {
            System.out.println("Transport cu metroul");
            calator.deplaseaza(nrKm);
        } else{
            this.getNextMijlocDeTransport().transporta(calator, nrKm);
        }
    }
}
