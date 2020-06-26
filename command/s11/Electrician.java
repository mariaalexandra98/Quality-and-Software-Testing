package command.s11;

public class Electrician implements IReparatie{
    @Override
    public void executaReparatie() {
        System.out.println("Electricianul a rezolvat problema");
    }
}
