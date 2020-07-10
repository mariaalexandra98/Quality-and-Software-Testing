package practice.memento.s14;

public class ApartmentMemento implements IProprietarApartament{
    private float costApaCalda;
    private float costGaze;

    @Override
    public void platesteIntretinere(Double sumaDePlata) {
        System.out.println("Plata suma de " + sumaDePlata);
    }

    public ApartmentMemento(float costApaCalda, float costGaze) {
        this.costApaCalda = costApaCalda;
        this.costGaze = costGaze;
    }

    public float getCostApaCalda() {
        return costApaCalda;
    }

    public float getCostGaze() {
        return costGaze;
    }
}
