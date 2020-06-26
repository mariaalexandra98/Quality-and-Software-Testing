package composite.s1;

public class TestareCompositeS1 {
    public static void main(String[] args) {
        PersonalaEmail personalaEmail1 = new PersonalaEmail("Popescu Andrei", "abc@gmail.com", 20, true);
        PersonalaEmail personalaEmail2 = new PersonalaEmail("Ciprian Vasile", "ciprian@gmail.com", 23, true);
        PersonalaEmail personalaEmail3 = new PersonalaEmail("Daniel Alex", "daniel@gmail.com", 17, false);

        GrupEmail grupEmail = new GrupEmail("grupul de fotbal");
        GrupEmail grupEmail2 = new GrupEmail("grupul de jocuri");

        grupEmail.adaugaCategorie(personalaEmail1);
        grupEmail.adaugaCategorie(personalaEmail2);
        grupEmail2.adaugaCategorie(personalaEmail3);
        grupEmail.adaugaCategorie(grupEmail2);

    }
}
