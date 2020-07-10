package practice.factory.practiceBoja;

public class FactoryCaractere {
    public static CaracterAbstract creareCaracter(String nume, TipCaracter tipCaracter) {
        switch (tipCaracter) {
            case NEGATIV:
                return new PersonajNegativ(nume);
            case POZITIV:
                return new PersonajPozitiv(nume, 100);
            default:
                return null;
        }
    }
}
