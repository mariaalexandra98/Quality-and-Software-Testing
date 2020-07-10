package practice.chainOfResponsability.s8;

public class FisierExe implements IAntivirus {
    @Override
    public void verificaActiuneUser(TipActiune tip, String url) {
        if(tip == TipActiune.DOWNLOAD && url.contains(".exe")) {
            System.out.println();
        }
    }
}
