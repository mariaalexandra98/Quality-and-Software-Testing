package testare.s6.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s6.categorii.ICategorieObligatorieS6;
import testare.s6.exceptii.ExceptiePunctajNul;

import static org.junit.Assert.assertEquals;

public class TestCalculTotalPuncte {
    TestGrila testGrila;
    @Before
    public void setUp() throws Exception {
        testGrila = new TestGrila("calitate si testare", 50, 2);
    }

    @Test(expected = ExceptiePunctajNul.class)
    @Category(ICategorieObligatorieS6.class)
    public void testExistence() throws ExceptiePunctajNul {
        testGrila.setIntrebari(null ,null);
        testGrila.calculTotalPuncte();
    }

    @Test
    public void testCardinality() throws ExceptiePunctajNul {
        testGrila.setIntrebari(new String[]{"i1", "i2"}, new int[]{20, 30});
        int rezultatActual = testGrila.calculTotalPuncte();
        int rezultatAsteptat = 100;
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testRight1() throws ExceptiePunctajNul {
        testGrila.setDificultate("usor");
        testGrila.setIntrebari(new String[]{"i1", "i2"}, new int[]{20, 30});
        int rezultatActual = testGrila.calculTotalPuncte();
        int rezultatAsteptat = 50;
        assertEquals(rezultatAsteptat, rezultatActual);
    }


    @Test
    public void testRight2() throws ExceptiePunctajNul {
        testGrila.setDificultate("dificil");
        testGrila.setIntrebari(new String[]{"i1", "i2"}, new int[]{20, 30});
        int rezultatActual = testGrila.calculTotalPuncte();
        int rezultatAsteptat = 100;
        assertEquals(rezultatAsteptat, rezultatActual);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void testErrorCondition() throws ExceptiePunctajNul {
        testGrila = new TestGrila("calitate si testare", 50, 8);
        testGrila.setIntrebari(new String[]{"i1", "i2"}, new int[]{20, 30});
        testGrila.calculTotalPuncte();
    }

}
