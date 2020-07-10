package practice.decorator.s8;

public abstract class PlugInDecorator implements IAntivirus{
    private IAntivirus antivirus;

    public PlugInDecorator(IAntivirus antivirus) {
        this.antivirus = antivirus;
    }

    @Override
    public void verificaActiuneUser(TipActiune tip, String url) {
        this.antivirus.verificaActiuneUser(tip, url);
    }

    public abstract void verificaPlugIn();
}
