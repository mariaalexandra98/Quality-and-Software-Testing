package practice.adapter.boja;

public class AdaptorDisney2ACME implements ICaracterACME{
    CarcaterDisney carcaterDisney;

    public AdaptorDisney2ACME(CarcaterDisney carcaterDisney) {
        this.carcaterDisney = carcaterDisney;
    }

    @Override
    public String getNume() {
        return this.carcaterDisney.getNume();
    }

    @Override
    public int getPuncteViata() {
        return this.carcaterDisney.getNivelEnergie();
    }

    @Override
    public void getDescriere() {
        System.out.println(this.carcaterDisney.getNume() + "-" + this.carcaterDisney.getNivelEnergie());
    }

    @Override
    public void esteAtacat(int puncte) {
        this.carcaterDisney.interactioneaza(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.carcaterDisney.reseteazaEnergie();
    }
}
