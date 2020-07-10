package testare.s5.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s5.categorii.ICategorieObligatorieS5;
import testare.s5.modele.TestGrila;

import static org.junit.Assert.assertEquals;

public class TestSetDificultate {
    TestGrila testGrila;

    @Before
    public void setUp() throws Exception {
        testGrila = new TestGrila("cts", 60, 2);
    }

    @Test
    @Category(ICategorieObligatorieS5.class)
    public void testRightDificil() {
        testGrila.setDificultate("dificil");
        int rezultatAsteptat = 2;
        int rezultatActual = testGrila.getDificultate();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testRightUsor() {
        testGrila.setDificultate("usor");
        int rezultatAsteptat = 1;
        int rezultatActual = testGrila.getDificultate();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testRightPro() {
        testGrila.setDificultate("pro");
        int rezultatAsteptat = 3;
        int rezultatActual = testGrila.getDificultate();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test(expected = UnsupportedOperationException.class)
    @Category(ICategorieObligatorieS5.class)
    public void testRightRandom() {
        testGrila.setDificultate("randomValue");
    }
}
