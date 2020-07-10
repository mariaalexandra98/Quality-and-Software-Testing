package practice.observer.practice;

public class Infirmiera implements IPacient {
    private String nume;

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Infirmiera " + nume + " a primit mesajul " + mesaj);
    }
}
