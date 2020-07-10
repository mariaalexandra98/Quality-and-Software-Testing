package practice.proxy.practice;

public class Spital implements ISpital{

    @Override
    public void spitalizeaza(Pacient pacient) {
        System.out.println("Spitalizarea pacient " + pacient.getNume());
    }
}
