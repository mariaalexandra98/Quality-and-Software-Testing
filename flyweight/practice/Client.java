package practice.flyweight.practice;

public class Client implements IClient {
    private String nume;
    private long nrAsigurare;

    public Client(String nume, long nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void desceiere(Reteta reteta) {
        System.out.println("Clientul " + nume + " are retata " + reteta.toString());
    }
}
