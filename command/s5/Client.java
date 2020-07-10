package practice.command.s5;

public class Client implements IClientBursa {
    private String numeCLient;

    public Client(String numeCLient) {
        this.numeCLient = numeCLient;
    }

    @Override
    public void vinde(String codActiuni, int nrActiuni) {
        System.out.println("Clientul " + numeCLient + " vinde actiunea cu codul " + codActiuni + " la un nr de " + nrActiuni);
    }

    @Override
    public void cumpara(String codActiuni, int nrActiuni) {
        System.out.println("Clientul " + numeCLient + " cumpara actiunea cu codul " + codActiuni + " la un nr de " + nrActiuni);
    }
}
