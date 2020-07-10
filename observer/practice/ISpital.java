package practice.observer.practice;

public interface ISpital {
    public void adaugaObserver(IPacient pacient);
    public void stergeObserve(IPacient pacient);
    public void notifica(String mesaj);
}
