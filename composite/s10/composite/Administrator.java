package practice.composite.s10.composite;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends LocatarAbstract implements ILocatarCategorie {
    private boolean isPensionat;
    private List<LocatarAbstract> locatari;

    public Administrator(String nume, boolean isPensionat) {
        this.nume = nume;
        this.isPensionat = isPensionat;
        locatari = new ArrayList<>();
    }

    @Override
    public void adaugaCategorieLocatar(LocatarAbstract locatar) {
        locatari.add(locatar);
    }

    @Override
    public void eliminaCategorieLocatar(LocatarAbstract locatar) {
        locatari.remove(locatar);
    }

    @Override
    public void primesteMesajAdministratie(String mesaj, String numarBloc) {
        System.out.println("Administratorul primeste mesajul " + mesaj + " la blocul " + numarBloc);
        for(LocatarAbstract locatarCategorie : locatari) {
            locatarCategorie.primesteMesajAdministratie(mesaj, numarBloc);
        }
    }

    @Override
    public void platesteIntretinere(Double sumaDePlata) {
        System.out.println("Administratorul plateste " + sumaDePlata);
        for(LocatarAbstract locatarCategorie : locatari) {
            locatarCategorie.platesteIntretinere(sumaDePlata);
        }
    }
}
