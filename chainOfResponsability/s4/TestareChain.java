package practice.chainOfResponsability.s4;

public class TestareChain {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz();
        MijlocDeTransport metrou = new Metrou();
        MijlocDeTransport tramvai = new Tramvai();
        MijlocDeTransport tren = new Tren();

        autobuz.setNextMijlocDeTransport(metrou);
        metrou.setNextMijlocDeTransport(tramvai);
        tramvai.setNextMijlocDeTransport(tren);

        Calator calator = new Calator();

        autobuz.transporta(calator, 100);
    }
}
