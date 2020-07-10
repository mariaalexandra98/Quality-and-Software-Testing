package practice.factory.practice;

public class PersonalFactory {
    public static IPersonal crarePersonal(TipPersonal tipPersonal, String nume) {
        switch (tipPersonal) {
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            case BRACARDIER:
                return new Bracardier(nume);
            default:
                return null;
        }
    }
}
