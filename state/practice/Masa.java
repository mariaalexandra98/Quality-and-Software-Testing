package practice.state.practice;

public class Masa {
    private Stare stare;
    private int nrMasa;

    public Masa(Stare stare, int nrMasa) {
        this.stare = stare;
        this.nrMasa = nrMasa;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void ocupa() {
        if(!(stare instanceof StareOcupata)) {
            this.stare = new StareOcupata();
            stare.printStare(nrMasa);
        } else{
            System.out.println("Masa " + nrMasa + " nu poate fi ocupata");
        }
    }

    public void elibereaza() {
        if(!(stare instanceof StareLibera)) {
            stare = new StareLibera();
            stare.printStare(nrMasa);
        } else{
            System.out.println("Masa cu nr " + nrMasa + " e deja libera");
        }
    }
}
