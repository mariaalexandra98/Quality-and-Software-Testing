package testare.s1.suitaTeste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.s1.categorii.ICategorieObligatorie;
import testare.s1.cazuri.TestCalculValoareTVA;
import testare.s1.cazuri.TestSetPret;

@RunWith(Categories.class)
@Categories.IncludeCategory(ICategorieObligatorie.class)
@Suite.SuiteClasses({TestCalculValoareTVA.class, TestSetPret.class})
public class Suita {
}
