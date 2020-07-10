package practice.command.s6;

public class Curier implements ILivrareComanda{
    private String nume;
    private int rating;

    public Curier(String nume, int rating) {
        this.nume = nume;
        this.rating = rating;
    }

    @Override
    public void livrareComanda(String cumparaturi, String numeClient) {
        System.out.println("Curierul " + nume + " cu ratingul " + rating + " livreaza " + cumparaturi + " lui " + nume);
    }
}
