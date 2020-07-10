package practice.proxy.S14;

public class TestareProxy {
    public static void main(String[] args) {
        IInterfon interfon = new ProxyInterfon(TipPersoana.ADULT, new Interfon());
        System.out.println("Suna la " + interfon.sunaApartament(100));

        IInterfon interfon2 = new ProxyInterfon(TipPersoana.COPIL, new Interfon());
        System.out.println("Suna la " + interfon2.sunaApartament(100));

    }
}
