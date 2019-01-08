package test.RegressionTest.modification;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.EqualClassTest.ConvertPressureTest;
import test.EqualClassTest.ConvertTemperatureTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(ModificationTestCase.class)
@Suite.SuiteClasses(
        {
                ConvertPressureTest.class,
                ConvertTemperatureTest.class
        }
)
public class TestBasedModification {

}
