package practice.factory.practiceBoja;

public class PersonajPozitiv extends CaracterAbstract {
    @Override
    public void afisareEcran() {
        System.out.println("Personajul " + numeCaracter + " este pozitiv si are " + puncteViata + " puncte de viata");
    }

    public PersonajPozitiv(String nume, float puncte) {
        this.numeCaracter = nume;
        this.puncteViata = puncte;
    }
}
