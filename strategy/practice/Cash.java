package practice.strategy.practice;

public class Cash implements IModalitatePlata {
    @Override
    public void realizeazaPlata(String numePacient, double sumaPlata) {
        System.out.println(numePacient + " plateste cash " + sumaPlata);
    }
}
