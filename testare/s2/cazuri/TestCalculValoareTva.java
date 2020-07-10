package testare.s2.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s2.categorii.ICategorieObligatorie;
import testare.s2.exceptii.ExceptieFacturaFaraProduse;
import testare.s2.modele.Facturare;

import static org.junit.Assert.assertEquals;

public class TestCalculValoareTva {

    Facturare facturare;

    @Before
    public void setUp() throws Exception {
        facturare = new Facturare();
    }

    @Test(expected = ExceptieFacturaFaraProduse.class)
    @Category(ICategorieObligatorie.class)
    public void testExistence() throws ExceptieFacturaFaraProduse {
        facturare.calculValoareTVA(null, null);
    }

    @Test
    public void testCrossCheck() throws ExceptieFacturaFaraProduse {
        Double rezultatActual = facturare.calculValoareTVA(100d, 19d);
        Double rezultatAltaMetoda = caluleazaTVA(100d, 19d);
        assertEquals(rezultatAltaMetoda, rezultatActual);

    }

    public double caluleazaTVA(Double valoareFaraTVA, Double valoareTVA) {
        return valoareFaraTVA / 100 * valoareTVA;
    }
}
