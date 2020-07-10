package testare.s2.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s2.categorii.ICategorieObligatorie;
import testare.s2.modele.Produs;

import static org.junit.Assert.assertEquals;

public class TestSetPret {
    Produs produs;
    @Before
    public void setUp() throws Exception {
        produs = new Produs("apa", 10d);
    }

    @Test
    @Category(ICategorieObligatorie.class)
    public void testRange10() {
        produs.setPret((double) 10, 2);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 5d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testBoundary1() {
        produs.setPret((double) 1, 5);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 1d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testBoundary1000() {
        produs.setPret((double) 1000, 2);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 500d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testRight1() {
        produs.setPret((double) 10, 1);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 10d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }
}
