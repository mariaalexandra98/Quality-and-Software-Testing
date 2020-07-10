package testare.s5.suita;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.s5.categorii.ICategorieObligatorieS5;
import testare.s5.cazuri.TestCalculTotalPuncte;
import testare.s5.cazuri.TestSetDificultate;
import testare.s5.cazuri.TestSetPunctajMaxim;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestCalculTotalPuncte.class, TestSetDificultate.class, TestSetPunctajMaxim.class})
@Categories.IncludeCategory(ICategorieObligatorieS5.class)
public class SuitaTeste {
}
