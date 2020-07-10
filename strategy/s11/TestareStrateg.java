package practice.strategy.s11;

public class TestareStrateg {
    public static void main(String[] args) {
        IPublicareAnunt publicareAnunt = new CaleElecronica();
        AcociatieProprietari acociatieProprietari = new AcociatieProprietari("batranii alcoolici anonimi", publicareAnunt);
        acociatieProprietari.executaStrategie();
        acociatieProprietari.setPublicareAnunt(new Avizier());
        acociatieProprietari.executaStrategie();
    }
}
