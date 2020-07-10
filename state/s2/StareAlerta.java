package practice.state.s2;

public class StareAlerta implements ITrecereCaleFerata{
    @Override
    public void pornesteAvertizareSonora(long durata) {
        System.out.println("Pornire alerta cu durata de " + durata);
    }

    @Override
    public void ridicaBariera() {
        System.out.println("Bariera trebuie coborata");
    }

    @Override
    public void coboaraBariera() {
        System.out.println("Bariera se coboara");
    }

    @Override
    public boolean seApropieTren() {
        return true;
    }

    @Override
    public boolean trenulATrecut() {
        return false;
    }
}
