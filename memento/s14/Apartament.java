package practice.memento.s14;

public class Apartament implements IApartament, IProprietarApartament {
    private int nrApartament;
    private float costApaCalda;
    private float costGaze;

    public Apartament(int nrApartament, float costApaCalda, float costGaze) {
        this.nrApartament = nrApartament;
        this.costApaCalda = costApaCalda;
        this.costGaze = costGaze;
    }

    public float getCostApaCalda() {
        return costApaCalda;
    }

    public void setCostApaCalda(float costApaCalda) {
        this.costApaCalda = costApaCalda;
    }

    public float getCostGaze() {
        return costGaze;
    }

    public void setCostGaze(float costGaze) {
        this.costGaze = costGaze;
    }

    @Override
    public void recuperareStareAartament(ApartmentMemento apartmentMemento) {
        this.costApaCalda = apartmentMemento.getCostApaCalda();
        this.costGaze = apartmentMemento.getCostGaze();
    }

    @Override
    public ApartmentMemento salvareStareApartament() {
        ApartmentMemento apartmentMemento = new ApartmentMemento(costApaCalda, costGaze);
        return apartmentMemento;
    }

    @Override
    public void platesteIntretinere(Double sumaDePlata) {
        System.out.println("Plata intretinere " + sumaDePlata);
    }
}
