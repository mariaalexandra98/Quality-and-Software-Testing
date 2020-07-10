package testare.s4.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s4.categorii.ICategorieObligatorieS4;
import testare.s4.exceptii.ExceptiePretIncorect;
import testare.s4.modele.Produs;

import static org.junit.Assert.assertEquals;

public class TestSetPret {
    Produs produs;

    @Before
    public void setUp() throws Exception {
        produs = new Produs("apa", 10d);
    }

    @Test
    @Category(ICategorieObligatorieS4.class)
    public void testRange() throws ExceptiePretIncorect {
        produs.setPret(100d, 2);
        Double rezultatAsteptat = 50d;
        Double rezultatActual = produs.getPret();
        assertEquals(rezultatAsteptat, rezultatActual);
    }

    @Test(expected = ExceptiePretIncorect.class)
    public void testExceptie() throws ExceptiePretIncorect {
        produs.setPret(-100d, 1);
    }
}
