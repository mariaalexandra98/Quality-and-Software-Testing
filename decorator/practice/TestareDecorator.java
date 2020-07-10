package practice.decorator.practice;

public class TestareDecorator {
    public static void main(String[] args) {
        INotaPlata notaPlata = new NotaPlata(200);
        notaPlata.emiteNota();

        Decorator felicitare = new FelicitareDecoratorConcret(notaPlata, "LMA");
        felicitare.emiteNota();
        felicitare.printeazaFelicitare();

    }
}
