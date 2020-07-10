package practice.composite.s10.composite;

import java.util.ArrayList;
import java.util.List;

public class PresedinteScara extends LocatarAbstract implements ILocatarCategorie {
    private int vechime;
    private List<LocatarAbstract> locatariDeScara;

    public PresedinteScara(int vechime, String nume) {
        this.vechime = vechime;
        this.nume = nume;
        locatariDeScara = new ArrayList<>();
    }

    @Override
    public void adaugaCategorieLocatar(LocatarAbstract iLocatarCategorie) {
        locatariDeScara.add(iLocatarCategorie);
    }

    @Override
    public void eliminaCategorieLocatar(LocatarAbstract iLocatarCategorie) {
        locatariDeScara.remove(iLocatarCategorie);
    }

    @Override
    public void primesteMesajAdministratie(String mesaj, String numarBloc) {
        System.out.println("Presedintele de scara " + nume + " a primit mesajul " + mesaj + " si are numarul de bloc " + numarBloc);
        for(LocatarAbstract locatarCategorie : locatariDeScara) {
            locatarCategorie.primesteMesajAdministratie(mesaj, numarBloc);
        }
    }

    @Override
    public void platesteIntretinere(Double sumaDePlata) {
        System.out.println("Presedintele de scara " + nume + "are de plata " + sumaDePlata);
        for(LocatarAbstract locatarCategorie : locatariDeScara) {
            locatarCategorie.platesteIntretinere(sumaDePlata);
        }
    }
}
