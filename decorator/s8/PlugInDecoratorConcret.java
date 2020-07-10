package practice.decorator.s8;

public class PlugInDecoratorConcret extends PlugInDecorator {
    private String nume;

    public PlugInDecoratorConcret(IAntivirus antivirus, String nume) {
        super(antivirus);
        this.nume = nume;
    }

    @Override
    public void verificaPlugIn() {
        System.out.println("Verificare plug in cu numele " + nume);
    }
}
