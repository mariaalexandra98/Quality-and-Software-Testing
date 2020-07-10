package practice.factory.practice;

public class Medic implements IPersonal {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void indeplinesteDatorie() {
        System.out.println("Indeplinire job de medicul " + nume);
    }
}
