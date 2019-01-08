package test.RegressionTest.random;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.EqualClassTest.ConvertPressureTest;
import test.EqualClassTest.ConvertTemperatureTest;
import test.EqualClassTest.ConverterServiceTest;

@RunWith(FilteredSuite.class)
@Suite.SuiteClasses(
        {
                ConvertPressureTest.class,
                ConvertTemperatureTest.class,
                ConverterServiceTest.class

        })
@SuiteMethods(0.5)
public class Random50 {
}
