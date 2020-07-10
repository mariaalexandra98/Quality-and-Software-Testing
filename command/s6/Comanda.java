package practice.command.s6;

public class Comanda implements IGlovo {
    private ILivrareComanda curier;
    private String numeClient;
    private String numeMagazin;
    private float cost;

    public Comanda(ILivrareComanda curier, String numeMagazin, float cost) {
        this.curier = curier;
        this.numeMagazin = numeMagazin;
        this.cost = cost;
    }

    @Override
    public void getListaCumparaturi(String listaCumparaturi) {
        this.curier.livrareComanda(listaCumparaturi, numeClient);
    }
}
