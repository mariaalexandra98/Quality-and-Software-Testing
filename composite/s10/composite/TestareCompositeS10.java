package practice.composite.s10.composite;

public class TestareCompositeS10 {
    public static void main(String[] args) {
        Locatar locatar = new Locatar("Popescu Andreea");
        Locatar locatar2 = new Locatar("Vasilescu Ioan");
        Locatar locatar3 = new Locatar("Popa Gabriel");

        PresedinteScara predesinteDeScara1 = new PresedinteScara( 12,"Ana Maria Prodan");
        PresedinteScara predesinteDeScara2 = new PresedinteScara(5, "Angel Lucian");
        PresedinteScara predesinteDeScara3 = new PresedinteScara(2, "Daniel Cosmin");

        Administrator administrator = new Administrator("Administratorul Andrei", false);

        predesinteDeScara1.adaugaCategorieLocatar(locatar);
        predesinteDeScara2.adaugaCategorieLocatar(locatar2);
        predesinteDeScara2.adaugaCategorieLocatar(locatar3);

        administrator.adaugaCategorieLocatar(predesinteDeScara1);
        administrator.adaugaCategorieLocatar(predesinteDeScara2);
        administrator.adaugaCategorieLocatar(predesinteDeScara3);

        administrator.primesteMesajAdministratie("A fost afisata plata pentru luna iulie la blocul " , "abx");
    }


}
