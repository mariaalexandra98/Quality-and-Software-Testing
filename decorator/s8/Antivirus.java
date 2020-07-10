package practice.decorator.s8;

public class Antivirus implements IAntivirus{
    private String denumire;
    private int pret;

    public Antivirus(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void verificaActiuneUser(TipActiune tip, String url) {
        System.out.println("Antivirusul verifica actiunea " + tip + " cu url ul " + url);
    }
}
