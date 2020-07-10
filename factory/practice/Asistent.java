package practice.factory.practice;

public class Asistent implements IPersonal{
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void indeplinesteDatorie() {
        System.out.println("Indeplinire job de asistentul " + nume);
    }
}
