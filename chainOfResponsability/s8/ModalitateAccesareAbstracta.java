package practice.chainOfResponsability.s8;

public abstract class ModalitateAccesareAbstracta {
    private Antivirus nextAntivirus;

    public Antivirus getNextAntivirus() {
        return nextAntivirus;
    }

    public void setNextAntivirus(Antivirus nextAntivirus) {
        this.nextAntivirus = nextAntivirus;
    }

    public abstract void efectueazaVerificare(TipActiune tip, String url);
}
