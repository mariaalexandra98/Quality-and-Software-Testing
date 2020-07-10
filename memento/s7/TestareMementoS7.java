package practice.memento.s7;

public class TestareMementoS7 {
    public static void main(String[] args) {
        ImagineBitmapConcreta imagineBitmap = new ImagineBitmapConcreta(100, 100, "alb, verde", 30, "prima mea img");
        ManagerStariImagine managerStariImagine = new ManagerStariImagine();

        managerStariImagine.backUp(imagineBitmap.salvareStare(), "12-12-2020");

        imagineBitmap.setDimensiune(300);
        imagineBitmap.setLatime(300);
        imagineBitmap.setSchemaCulori("negru");
        imagineBitmap.afisareImagine();

        managerStariImagine.backUp(imagineBitmap.salvareStare(), "13-12-2020");

        imagineBitmap.recuperareStareImagineBitmap(managerStariImagine.restore("12-12-2020"));
        imagineBitmap.afisareImagine();
    }
}
