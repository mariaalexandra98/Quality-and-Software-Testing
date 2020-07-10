package practice.memento.s14;

public class TestareMemento {
    public static void main(String[] args) {
        Apartament apartament = new Apartament(12, 100, 123);
        ManagerStareApartament managerStareApartament = new ManagerStareApartament();

        managerStareApartament.addBackup(apartament.salvareStareApartament());

        apartament.setCostApaCalda(200);
        apartament.setCostGaze(300);

        apartament.platesteIntretinere((double) (apartament.getCostApaCalda() + apartament.getCostGaze()));

        apartament.recuperareStareAartament(managerStareApartament.getStare(0));
        apartament.platesteIntretinere((double) (apartament.getCostApaCalda() + apartament.getCostGaze()));

    }
}
