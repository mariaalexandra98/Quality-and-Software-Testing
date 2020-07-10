package practice.factory.practiceBoja;

public class PersonajNegativ extends CaracterAbstract {
    @Override
    public void afisareEcran() {
        System.out.println("Personajul " + numeCaracter + " este negativ");
    }

    public PersonajNegativ(String nume) {
    this.numeCaracter  = nume;
    }
}
