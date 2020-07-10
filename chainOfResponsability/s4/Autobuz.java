package practice.chainOfResponsability.s4;

public class Autobuz extends MijlocDeTransport {
    @Override
    public void transporta(ICalator calator, int nrKm) {
        if(nrKm <= 5) {
            System.out.println("Deplasare cu autobuzul");
            calator.deplaseaza(nrKm);
        } else{
            this.getNextMijlocDeTransport().transporta(calator, nrKm);
        }
    }
}
