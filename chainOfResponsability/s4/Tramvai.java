package practice.chainOfResponsability.s4;

public class Tramvai extends MijlocDeTransport {
    @Override
    public void transporta(ICalator calator, int nrKm) {
        if(nrKm <= 10) {
            System.out.println("Transport cu trmvaiul");
            calator.deplaseaza(nrKm);
        } else{
            this.getNextMijlocDeTransport().transporta(calator, nrKm);
        }
    }
}
