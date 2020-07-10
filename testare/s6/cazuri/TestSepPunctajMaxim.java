package testare.s6.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s6.categorii.ICategorieObligatorieS6;
import testare.s6.exceptii.EroatePunctajMaxim;

import static org.junit.Assert.assertEquals;

public class TestSepPunctajMaxim {
    TestGrila testGrila;

    @Before
    public void setUp() throws Exception {
        testGrila = new TestGrila("calitate si testare", 50, 2);
    }

    @Test
    @Category(ICategorieObligatorieS6.class)
    public void testBoundaryInferior() throws EroatePunctajMaxim {
        testGrila.setPunctajMaxim(10);
        int rezultatAsteptat = 10;
        int rezultatActual = testGrila.getPunctajMaxim();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test
    public void testBoundarySuperior() throws EroatePunctajMaxim {
        testGrila.setPunctajMaxim(90);
        int rezultatAsteptat = 90;
        int rezultatActual = testGrila.getPunctajMaxim();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test(expected = EroatePunctajMaxim.class)
    public void testErrorCondition() throws EroatePunctajMaxim {
        testGrila.setPunctajMaxim(-90);
    }
}
