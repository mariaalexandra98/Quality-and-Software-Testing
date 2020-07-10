package testare.s11.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s11.categorii.ICategorieObligatorieS11;
import testare.s11.modele.Avion;

import static org.junit.Assert.assertEquals;

public class TestGetNumarLocuriOcupate {
    Avion avion;

    @Before
    public void setUp() throws Exception {
        avion = new Avion(100, "avion de lupta", 200);
    }

    @Test
    @Category(ICategorieObligatorieS11.class)
    public void testCardinality() {
        boolean[] locuri = new boolean[]{true, true, false, true, true};
        int rezultatActual = avion.getNumarLocuriOcupate(locuri);
        int rezultatAsteptat = -6;
        assertEquals(rezultatAsteptat, rezultatActual, 0);
    }

    @Test(timeout = 1000)
    public void testPerformance() {
        boolean[] ocupare = new boolean[1000];
        for(int i = 0; i < ocupare.length; i++) {
            ocupare[i] = true;
        }
        int numarLocuriOcupateAsteptat = 990;
        int numarLocuriOcupateActual = avion.getNumarLocuriOcupate(ocupare);
        assertEquals(numarLocuriOcupateAsteptat, numarLocuriOcupateActual);
    }
}
