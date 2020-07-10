package testare.s3.suita;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.s3.categorii.ICategorieObligatorie;
import testare.s3.cazuri.TestSetPret;
import testare.s3.cazuri.TestValoareTVA;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestSetPret.class, TestValoareTVA.class})
@Categories.IncludeCategory(ICategorieObligatorie.class)
public class SuitaTeste {
}
