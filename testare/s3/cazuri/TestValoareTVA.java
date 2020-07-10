package testare.s3.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s2.exceptii.ExceptieFacturaFaraProduse;
import testare.s3.categorii.ICategorieObligatorie;
import testare.s3.exceptii.ExceptieValoareInvalida;
import testare.s3.model.Facturare;

import static org.junit.Assert.assertEquals;

public class TestValoareTVA {
    testare.s3.model.Facturare facturare;

    @Before
    public void setUp() throws Exception {
        facturare = new Facturare();
    }

    @Category(ICategorieObligatorie.class)
    @Test(expected = ExceptieValoareInvalida.class)
    public void testExistence() throws ExceptieFacturaFaraProduse, ExceptieValoareInvalida {
        facturare.calculValoareTVA(null, null);
    }

    @Test
    public void testCrossCheck() throws ExceptieValoareInvalida {
        Double valoareAsteptata = metodaNouaCalculTVA(119d, 100d);
        Double valoareActuala = facturare.calculValoareTVA(100d, 19d);
        assertEquals(valoareAsteptata, valoareActuala);
    }

    public double metodaNouaCalculTVA(Double valCuTVA, Double valFaraTVa) throws ExceptieValoareInvalida {
        if(valCuTVA != null && valFaraTVa != null) {
            return valCuTVA - valFaraTVa;
        } else {
            throw new ExceptieValoareInvalida("Valori invalide");
        }
    }
}
