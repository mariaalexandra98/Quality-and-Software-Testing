package testare.s5.cazuri;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.s5.categorii.ICategorieObligatorieS5;
import testare.s5.exceptii.EroarePunctajMaxim;
import testare.s5.modele.TestGrila;

public class TestSetPunctajMaxim {
    TestGrila testGrila;

    @Before
    public void setUp() throws Exception {
        testGrila = new TestGrila("cts", 60, 2);
    }

    @Test(expected = EroarePunctajMaxim.class)
    @Category(ICategorieObligatorieS5.class)
    public void testErrorCondition() throws EroarePunctajMaxim {
        testGrila.setPunctajMaxim(-10);
    }
}
