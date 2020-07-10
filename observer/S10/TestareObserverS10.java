package practice.observer.S10;

public class TestareObserverS10 {
    public static void main(String[] args) {
        ILocatar locatar1 = new Locatar("Popescu Andrei");
        ILocatar locatar2 = new Locatar("Coman Mihai");

        ILocatar locatar3 = new Locatar("Vasilescu Maria");
        ILocatar locatar4 = new Locatar("Viciu Catalina");

        Administrator administrator = new Administrator(100);
        administrator.abonareObservator(locatar1);
        administrator.abonareObservator(locatar2);

        Administrator administrator1 = new Administrator(200);
        administrator1.abonareObservator(locatar3);
        administrator1.abonareObservator(locatar4);

        administrator.notifica("S-a afisat chiria");
        administrator1.notifica("Vai de capul vostru");

        administrator1.dezabonareObservator(locatar4);
        administrator1.notifica("Test dezabonare locatar4");
    }
}
