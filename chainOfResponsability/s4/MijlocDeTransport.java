package practice.chainOfResponsability.s4;

public abstract class MijlocDeTransport {
    private MijlocDeTransport nextMijlocDeTransport;

    public MijlocDeTransport getNextMijlocDeTransport() {
        return nextMijlocDeTransport;
    }

    public void setNextMijlocDeTransport(MijlocDeTransport nextMijlocDeTransport) {
        this.nextMijlocDeTransport = nextMijlocDeTransport;
    }

    public abstract void transporta(ICalator calator, int nrKm);
}
