package practice.strategy.practice;

public class Card implements IModalitatePlata {
    @Override
    public void realizeazaPlata(String numePacient, double sumaPlata) {
        System.out.println(numePacient + " plateste cu cardul " + sumaPlata);
    }
}
