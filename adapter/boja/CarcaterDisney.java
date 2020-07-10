package practice.adapter.boja;

public abstract class CarcaterDisney {
    protected String nume;
    protected int nivelEnergie;

    public CarcaterDisney(String nume, int nivelEnergie) {
        this.nume = nume;
        this.nivelEnergie = nivelEnergie;
    }

    public String getNume() {
        return nume;
    }

    public int getNivelEnergie() {
        return nivelEnergie;
    }

    public abstract void reseteazaEnergie();
    public abstract void interactioneaza(float energie);
}
