package practice.chainOfResponsability.s8;

public class Antivirus implements IAntivirus{
    @Override
    public void verificaActiuneUser(TipActiune tip, String url) {
        System.out.println("Tipul actiunii este " + tip + " iar url este " + url);
    }
}
