package practice.decorator.s8;

public class TestareDecorator {
    public static void main(String[] args) {
        IAntivirus antivirus = new Antivirus("Avira", 200);
        antivirus.verificaActiuneUser(TipActiune.DOWNLOAD, "url exe");

        PlugInDecorator decorator = new PlugInDecoratorConcret(antivirus, "aaaa");
        decorator.verificaActiuneUser(TipActiune.DOWNLOAD, "url exe");
        decorator.verificaPlugIn();
    }
}
