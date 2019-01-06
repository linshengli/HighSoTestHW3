package test.RegressionTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.EqualClassTest.ConvertPressureTest;
import test.EqualClassTest.ConvertTemperatureTest;

@RunWith(Categories.class)
@Suite.SuiteClasses(
        {
                ConvertPressureTest.class,
                ConvertTemperatureTest.class
        }
)
public class TestBasedRisk {
}
