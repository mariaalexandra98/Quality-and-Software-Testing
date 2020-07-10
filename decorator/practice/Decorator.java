package practice.decorator.practice;

public abstract class Decorator implements INotaPlata{
    private INotaPlata notaPlata;

    public Decorator(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void emiteNota() {
        this.notaPlata.emiteNota();
    }

    public abstract void printeazaFelicitare();
}
