package practice.adapter.boja;

public class LooneyTunes extends CarcaterDisney {
    public LooneyTunes(String nume, int nivelEnergie) {
        super(nume, nivelEnergie);
    }

    @Override
    public void reseteazaEnergie() {
        System.out.println("Nivel de energie resetat");
        this.nivelEnergie = 100;
    }

    @Override
    public void interactioneaza(float energie) {
        System.out.println("Disney: " + this.nume);
        this.nivelEnergie -= energie;
    }
}
