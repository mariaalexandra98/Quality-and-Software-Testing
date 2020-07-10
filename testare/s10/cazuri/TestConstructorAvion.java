package testare.s10.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import s10.testare.cazuri.ICategorieObligatorie;
import testare.s10.categorii.ICategorieObligatorieS10;
import testare.s10.exceptii.ExceptieConstructorAvion;
import testare.s10.modele.Avion;

public class TestConstructorAvion {

    @Test(expected = ExceptieConstructorAvion.class)
    @Category(ICategorieObligatorieS10.class)
    public void testExistence() throws ExceptieConstructorAvion {
        Float val = null;
        Float val2 = null;
        Avion avion = new Avion(0, null, 0);
    }

    @Test
    public void testRange() throws ExceptieConstructorAvion {
        Avion avion = new Avion(0, "avion cu motor", 100);
    }
}
