package practice.strategy.practice;

public class TestareStrategy {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Popescu Alin");
        pacient.plateste(100);
        pacient.setModalitatePlata(new Cash());
        pacient.plateste(20);
    }
}
