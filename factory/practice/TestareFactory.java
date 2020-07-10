package practice.factory.practice;

public class TestareFactory {
    public static void main(String[] args) {
        IPersonal personal1 = PersonalFactory.crarePersonal(TipPersonal.ASISTENT, "Popescu Andrei");
        personal1.indeplinesteDatorie();

        IPersonal personal2 = PersonalFactory.crarePersonal(TipPersonal.BRACARDIER, "Vasile Maria");
        personal2.indeplinesteDatorie();

        IPersonal personal3 = PersonalFactory.crarePersonal(TipPersonal.ASISTENT, "Dragos");
        personal3.indeplinesteDatorie();

    }
}
