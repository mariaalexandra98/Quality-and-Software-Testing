package practice.composite.practice;

public class TestareComposite {
    public static void main(String[] args) {
        Nod categorie1 = new Categorie("Raceala");
        Nod categorie2 = new Categorie("Febra");

        Nod subCategorie1 = new Categorie("Adulti");
        Nod subCategorie2 = new Categorie("Copii");

        Nod medicament1 = new Medicament("Nurofen");
        Nod medicament2 = new Medicament("Parasinus");
        Nod medicament3 = new Medicament("Teraflu copii");

        subCategorie1.adaugaNod(medicament1);
        subCategorie1.adaugaNod(medicament2);
        subCategorie2.adaugaNod(medicament3);
        categorie1.adaugaNod(subCategorie1);
        categorie1.adaugaNod(subCategorie2);
        categorie2.adaugaNod(categorie1);

        categorie1.descriere("");
    }
}
