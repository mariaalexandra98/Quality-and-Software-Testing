package testare.s5.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s5.categorii.ICategorieObligatorieS5;
import testare.s5.modele.TestGrila;

import static org.junit.Assert.assertEquals;

public class TestCalculTotalPuncte {
    TestGrila testGrila;

    @Before
    public void setUp() throws Exception {
        testGrila = new TestGrila("cts", 60, 2);
    }

    @Test
    @Category(ICategorieObligatorieS5.class)
    public void testOrderingCrescator() {
        testGrila.setIntrebari(new String[]{"i1", "i2"}, new int[]{10, 23});
        int rezultatActual = testGrila.calculTotalPuncte();
        int rezultatAsteptat = 66;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testCardinality() {
        testGrila.setDificultate("usor");
        testGrila.setIntrebari(new String[]{"i1"}, new int[]{10});
        int rezultatActual = testGrila.calculTotalPuncte();
        int rezultatAsteptat = 10;
        assertEquals(rezultatAsteptat, rezultatActual);
    }
}
