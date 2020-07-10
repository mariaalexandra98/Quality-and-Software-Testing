package practice.decorator.practice;

public class FelicitareDecoratorConcret extends Decorator {
    private String mesaj;

    public FelicitareDecoratorConcret(INotaPlata notaPlata, String mesaj) {
        super(notaPlata);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Aceasta este o felicitare cu mesajul " + mesaj);
    }
}
