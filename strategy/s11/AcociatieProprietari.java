package practice.strategy.s11;

public class AcociatieProprietari {
    String denumire;
    IPublicareAnunt publicareAnunt;

    public AcociatieProprietari(String denumire, IPublicareAnunt publicareAnunt) {
        this.denumire = denumire;
        this.publicareAnunt = publicareAnunt;
    }

    public void executaStrategie() {
        publicareAnunt.publicaAnunt(denumire);
    }

    public void setPublicareAnunt(IPublicareAnunt publicareAnunt) {
        this.publicareAnunt = publicareAnunt;
    }
}
