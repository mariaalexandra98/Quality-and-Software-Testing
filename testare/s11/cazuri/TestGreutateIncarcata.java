package testare.s11.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s11.categorii.ICategorieObligatorieS11;
import testare.s11.exceptii.ExceptieValoareNeconforma;
import testare.s11.modele.Avion;

import static org.junit.Assert.assertEquals;

public class TestGreutateIncarcata {
    Avion avion;

    @Before
    public void setUp() throws Exception {
        avion = new Avion(100, "avion de lupta", 200);
    }

    @Test
    @Category(ICategorieObligatorieS11.class)
    public void testRight() throws ExceptieValoareNeconforma {
        avion.setGreutateIncarcata(20);
        float rezultatActual = avion.getGreutateIncarcata();
        float rezultatAsteptat = 20;
        assertEquals(rezultatAsteptat, rezultatActual, 0);
    }


    @Test(expected = ExceptieValoareNeconforma.class)
    public void testConformance() throws ExceptieValoareNeconforma {
        avion.setGreutateIncarcata(-98);
        float rezultatActual = avion.getGreutateIncarcata();
    }
}
