package test.EqualClassTest;

import converter.Constants;
import converter.ConverterService;
import org.junit.Before;
import org.junit.Test;

import test.stub.FakeConvertPressureAdapter;
import test.stub.FakeConvertTemperatureAdapter;

import static org.junit.Assert.assertEquals;

public class ConverterServiceTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testConvert1() {
        ConverterService cs = new ConverterService();

        // temperature converter test
        cs.setConvertPressure(new FakeConvertPressureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value * 10;
            }
        });
        cs.setConvertTemperature(new FakeConvertTemperatureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value;
            }
        });

        assertEquals("33.8", cs.convert(Double.valueOf(33.8), Constants.CELSIUS, Constants.FAHRENHEIT, Constants.TEMPERATURE));

    }

    @Test
    public void testConvert2() {
        ConverterService cs = new ConverterService();

        // temperature converter test
        cs.setConvertPressure(new FakeConvertPressureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value * 10;
            }
        });
        cs.setConvertTemperature(new FakeConvertTemperatureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value;
            }
        });

        assertEquals("338", cs.convert(Double.valueOf(33.8), Constants.PA, Constants.KPA, Constants.PRESSURE));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert3() {
        ConverterService cs = new ConverterService();

        // temperature converter test
        cs.setConvertPressure(new FakeConvertPressureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value * 10;
            }
        });
        cs.setConvertTemperature(new FakeConvertTemperatureAdapter() {
            public Double getResult(String originalUnit, String targetUnit, Double value) {
                return value;
            }
        });

        cs.convert(Double.valueOf(33.8), Constants.PA, Constants.KPA, "invalid");

    }


    @Test
    public void test_formatResult() {
        assertEquals("0.3341235", ConverterService.formatResult(0.3341234324));
        assertEquals("0.334", ConverterService.formatResult(0.334));
        assertEquals("0.3341235", ConverterService.formatResult(0.3341235));
    }

}
