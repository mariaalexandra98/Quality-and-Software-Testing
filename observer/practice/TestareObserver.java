package practice.observer.practice;

public class TestareObserver {
    public static void main(String[] args) {
        IPacient pacient = new Pacient("Andrei Popescu");
        IPacient infirmiera = new Pacient("Ana Prodan");

        Spital spital = new Spital();
        spital.adaugaObserver(pacient);

        spital.notifica("Alerta de incendiu");

        spital.adaugaObserver(infirmiera);
        spital.notifica("jk");
    }
}
