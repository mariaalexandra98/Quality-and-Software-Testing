package composite.practice;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Nod {
    private List<Nod> listaMedicamente;
    private String denumireCategorie;

    public Categorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
        this.listaMedicamente = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Nod categorie) {
        listaMedicamente.add(categorie);
    }

    @Override
    public void stergereNod(Nod categorie) {
        listaMedicamente.remove(categorie);
    }

    @Override
    public Nod getNod(int index) {
        if(index >= 0 && index <= listaMedicamente.size()) {
            return listaMedicamente.get(index);
        }
        return null;
    }

    @Override
    public void descriere(String indentare) {
        System.out.println("Categorie: " + denumireCategorie);
        for(Nod nod : listaMedicamente) {
            nod.descriere(indentare + "\t");
        }
    }
}
