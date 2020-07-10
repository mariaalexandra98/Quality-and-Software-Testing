package practice.state.practice;

public class StareLibera implements Stare {
    @Override
    public void schimbareStare(Masa masa) {
        masa.setStare(this);
    }

    @Override
    public void printStare(int nrMasa) {
        System.out.println("Masa " + nrMasa + " este libera");
    }
}
