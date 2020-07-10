package practice.observer.practice;

public class Pacient implements IPacient {
    private String numePacient;

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Pacientul " + numePacient + " a primit mesajul " + mesaj);
    }

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }
}
