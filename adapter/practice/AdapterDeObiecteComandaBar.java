package practice.adapter.practice;

public class AdapterDeObiecteComandaBar extends ComandaBucatarieSoftExistent{
    SoftAchizitionatComandaBar comandaBar;

    public AdapterDeObiecteComandaBar(SoftAchizitionatComandaBar comandaBar) {
        super();
        this.comandaBar = comandaBar;
    }

    @Override
    public void solicitaBon() {
        comandaBar.emiteBon();
    }
}
