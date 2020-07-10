package testare.s3.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s3.categorii.ICategorieObligatorie;
import testare.s3.model.Produs;

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
        produs.setPret(20d, 1);
        double rezultatAsteptat = 20d;
        double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual, 0.0);
    }

    @Test
    public void testBoundary1() {
        produs.setPret(1d, 5);
        double rezultatAsteptat = 1d;
        double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual, 0.0);
    }

    @Test
    public void testBoundary1000() {
        produs.setPret(1000d, 2);
        double rezultatAsteptat = 500d;
        double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual, 0.0);
    }
}
