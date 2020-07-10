package practice.proxy.S14;

public class ProxyInterfon implements IInterfon {
    TipPersoana tipPersoana;
    IInterfon interfon;

    public ProxyInterfon(TipPersoana tipPersoana, IInterfon interfon) {
        this.tipPersoana = tipPersoana;
        this.interfon = interfon;
    }

    @Override
    public int sunaApartament(int numarApartament) {
       if(tipPersoana == TipPersoana.ADULT) {
           return numarApartament;
       } else{
            throw new UnsupportedOperationException("Copiii nu pot apela");
       }
    }
}
