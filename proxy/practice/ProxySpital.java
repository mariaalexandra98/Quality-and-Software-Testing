package practice.proxy.practice;

public class ProxySpital implements ISpital {
    ISpital spital;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void spitalizeaza(Pacient pacient) {
        if(pacient.isEsteAsigurat()) {
            spital.spitalizeaza(pacient);
        } else{
            System.out.println("Nu se poate spitaliza pacientul " + pacient.getNume());
        }
    }
}
