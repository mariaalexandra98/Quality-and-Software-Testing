package practice.observer.s9;

public interface IGrupObserver {
    public void abonareObserver(Client observer);
    public void dezabonareObserver(Client observer);
    public void notifica(String mesaj);
}
