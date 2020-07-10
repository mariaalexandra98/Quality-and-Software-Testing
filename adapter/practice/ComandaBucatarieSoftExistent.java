package practice.adapter.practice;

public class ComandaBucatarieSoftExistent implements IComandaBucatarieSoftExistent {
    private float pretComanda;

    public ComandaBucatarieSoftExistent() {
    }

    public ComandaBucatarieSoftExistent(float pretComanda) {
        this.pretComanda = pretComanda;
    }

    @Override
    public void solicitaBon() {
        System.out.println("Aveti de platit " + pretComanda);
    }
}
