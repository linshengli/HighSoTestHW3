package test.RegressionTest.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.EqualClassTest.ConvertPressureTest;
import test.EqualClassTest.ConvertTemperatureTest;
import test.EqualClassTest.ConverterServiceTest;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ConvertPressureTest.class,
                ConvertTemperatureTest.class,
                ConverterServiceTest.class
        }
)
public class TestAll {


}
