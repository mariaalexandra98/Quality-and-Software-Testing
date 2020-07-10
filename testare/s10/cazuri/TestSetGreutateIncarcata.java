package testare.s10.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s10.categorii.ICategorieObligatorieS10;
import testare.s10.exceptii.ExceptieGreutateIncarcata;
import testare.s10.modele.Avion;

import static org.junit.Assert.assertEquals;

public class TestSetGreutateIncarcata {
    Avion avion;

    @Before
    public void setUp() throws Exception {
        avion = new Avion(200, "model de avion de lupta", 900);
    }

    @Test
    @Category(ICategorieObligatorieS10.class)
    public void testBoundaryInferior() throws ExceptieGreutateIncarcata {
        avion.setGreutateIncarcata(0);
        float rezultatAsteptat = 0;
        float rezultatActual = avion.getGreutateIncarcata();
        assertEquals(rezultatAsteptat, rezultatActual, 0.001);
    }

    @Test
    public void testBoundarySuperior() throws ExceptieGreutateIncarcata {
        avion.setGreutateIncarcata(1000);
        float rezultatAsteptat = 1000;
        float rezultatActual = avion.getGreutateIncarcata();
        assertEquals(rezultatAsteptat, rezultatActual, 0.001);
    }

    @Test(expected = ExceptieGreutateIncarcata.class)
    public void testErrorCondition() throws ExceptieGreutateIncarcata {
        avion.setGreutateIncarcata(-1000);
    }
}
