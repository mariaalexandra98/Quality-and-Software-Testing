package composite.practice;

public interface Nod {
    void adaugaNod(Nod categorie);
    void stergereNod(Nod categorie);
    Nod getNod(int index);
    void descriere(String indentare);
}
