package testare.s4.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s4.categorii.ICategorieObligatorieS4;
import testare.s4.exceptii.ExceptieFacturaFaraProduseS4;
import testare.s4.modele.Facturare;

public class TestCalculValoareTVA {
    Facturare facturare;

    @Before
    public void setUp() throws Exception {
        facturare = new Facturare();
    }

    @Test(expected = ExceptieFacturaFaraProduseS4.class)
    @Category(ICategorieObligatorieS4.class)
    public void testExistence() throws ExceptieFacturaFaraProduseS4 {
        facturare.calculValoareTVA(null, null);
    }
}
