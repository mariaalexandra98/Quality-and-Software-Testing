package testare.s1.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s1.model.Facturare;
import testare.s1.categorii.ICategorieObligatorie;
import testare.s1.exceptii.ExceptieValoareInvalida;

import static org.junit.Assert.assertEquals;

public class TestCalculValoareTVA {
    Facturare facturare;

    @Before
    public void setUp() throws Exception {
        facturare = new Facturare();
    }

    @Test(expected = ExceptieValoareInvalida.class)
    @Category(ICategorieObligatorie.class)
    public void testExistence() throws ExceptieValoareInvalida {
        facturare.calculValoareTVA(null, null);
    }

    @Test
    public void testInverse() throws ExceptieValoareInvalida {
        Double rezultatActual = facturare.calculValoareTVA(100d, 19d);
        Double calcul = (double)(100 * 19 / 100);
        assertEquals(calcul, rezultatActual);
    }
}
