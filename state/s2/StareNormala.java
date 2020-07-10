package practice.state.s2;

public class StareNormala implements ITrecereCaleFerata {
    @Override
    public void pornesteAvertizareSonora(long durata) {
        System.out.println("Avertizarea nu este in functiune");
    }

    @Override
    public void ridicaBariera() {
        System.out.println("Bariera este ridicata");
    }

    @Override
    public void coboaraBariera() {
        System.out.println("Bariera este ridicata");
    }

    @Override
    public boolean seApropieTren() {
        return false;
    }

    @Override
    public boolean trenulATrecut() {
        return false;
    }
}
