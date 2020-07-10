package practice.observer.S10;

public interface IAdministrator {
    public void notifica(String mesaj);
    public void abonareObservator(ILocatar locatar);
    public void dezabonareObservator(ILocatar locatar);
}
