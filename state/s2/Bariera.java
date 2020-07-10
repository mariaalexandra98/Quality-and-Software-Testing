package practice.state.s2;

public class Bariera {
    private ITrecereCaleFerata stare;
    private int nrSecunde;

    public Bariera(int nrSecunde) {
        this.stare = new StareNormala();
        this.nrSecunde = nrSecunde;
    }

    public void setStare(ITrecereCaleFerata stare) {
        this.stare = stare;
    }

    public void ridicaBariera() {
        stare.ridicaBariera();
    }

    public void coboaraBariera() {
        stare.coboaraBariera();
    }


}
