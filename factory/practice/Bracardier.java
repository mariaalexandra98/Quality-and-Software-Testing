package practice.factory.practice;

public class Bracardier implements IPersonal {
    private String nume;

    public Bracardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void indeplinesteDatorie() {
        System.out.println("Indeplinire job de bracardierul " + nume);
    }
}
