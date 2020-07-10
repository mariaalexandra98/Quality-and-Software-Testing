package practice.proxy.S14;

public class Interfon implements IInterfon {
    @Override
    public int sunaApartament(int numarApartament) {
        System.out.println("Suna la apartamentul " + numarApartament);
        return numarApartament;
    }
}
