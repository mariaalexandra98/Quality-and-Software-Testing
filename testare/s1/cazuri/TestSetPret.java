package testare.s1.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s1.categorii.ICategorieObligatorie;
import testare.s1.model.Produs;

import static org.junit.Assert.assertEquals;

public class TestSetPret {

    Produs produs;
    @Before
    public void setUp() throws Exception {
        produs = new Produs("apa", 10d);
    }

    @Test
    @Category(ICategorieObligatorie.class)
    public void testRight() {
        produs.setPret(100d, 1);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 100d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testBoundary1() {
        produs.setPret(1d, 1);
        Double rezultatAsteptat = 1d;
        Double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testBoundary1000() {
        produs.setPret(1000d, 2);
        Double rezultatAsteptat = 500d;
        Double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testRight5() {
        produs.setPret(100d, 5);
        Double rezultatActual = produs.getPret();
        Double rezultatAsteptat = 100d;
        assertEquals(rezultatAsteptat, rezultatActual);
    }
}
