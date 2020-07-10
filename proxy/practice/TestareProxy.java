package practice.proxy.practice;

public class TestareProxy {
    public static void main(String[] args) {
        ISpital spital = new Spital();
        Pacient pacient1 = new Pacient("Andrei", true);
        Pacient pacient2 = new Pacient("Maria", false);

        spital.spitalizeaza(pacient1);
        spital.spitalizeaza(pacient2);
        System.out.println("-------------");
        ProxySpital proxySpital = new ProxySpital(spital);
        proxySpital.spitalizeaza(pacient1);
        proxySpital.spitalizeaza(pacient2);
    }
}
