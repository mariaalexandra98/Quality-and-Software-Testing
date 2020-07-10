package practice.decorator.practice;

public class NotaPlata implements INotaPlata {
    private float suma;

    public NotaPlata(float suma) {
        this.suma = suma;
    }

    @Override
    public void emiteNota() {
        System.out.println("Suma de plata: " + suma);
    }
}
