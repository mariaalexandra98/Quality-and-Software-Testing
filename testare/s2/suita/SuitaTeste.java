package testare.s2.suita;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.s2.categorii.ICategorieObligatorie;
import testare.s2.cazuri.TestCalculValoareTva;
import testare.s2.cazuri.TestSetPret;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestCalculValoareTva.class, TestSetPret.class})
@Categories.IncludeCategory(ICategorieObligatorie.class)
public class SuitaTeste {
}
