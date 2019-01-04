package test.PairWiseTest;

import converter.Constants;
import converter.ConvertTemperature;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertTemperatureTest {
    @Test
    public void test_Valid_GetResult1() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        assertEquals(1.0, convert.getResult(Constants.FAHRENHEIT, Constants.FAHRENHEIT, Double.valueOf(33.8)), 0.0000001);
        assertEquals(-272.15, convert.getResult(Constants.KELVIN, Constants.KELVIN, Double.valueOf(1)), 0.0000001);
        assertEquals(1.0, convert.getResult(Constants.CELSIUS, Constants.CELSIUS, Double.valueOf(1)), 0.0000001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult1() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", "invalid", Double.valueOf(1));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult1() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.FAHRENHEIT, Constants.KELVIN, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult2() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.FAHRENHEIT, Constants.CELSIUS, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult3() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.FAHRENHEIT, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult4() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.KELVIN, Constants.FAHRENHEIT, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult5() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.KELVIN, Constants.CELSIUS, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult6() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.KELVIN, "invalid", Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult7() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.CELSIUS, Constants.FAHRENHEIT, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult8() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.CELSIUS, Constants.KELVIN, Double.valueOf(-1000.0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult9() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.CELSIUS, "invalid", Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult10() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.FAHRENHEIT, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult11() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.KELVIN, Double.valueOf(-1000.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult12() {
        ConvertTemperature convert = new ConvertTemperature() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.CELSIUS, Double.valueOf(-1000.0));
    }

    @Test
    public void testGetConversion1() {
        ConvertTemperature cp = new ConvertTemperature();
        assertEquals(33.8, cp.getConversion(Constants.FAHRENHEIT, Double.valueOf(1)), 0.0000001);
    }

    @Test
    public void testGetConversion2() {
        ConvertTemperature cp = new ConvertTemperature();
        assertEquals(274.15, cp.getConversion(Constants.KELVIN, Double.valueOf(1)), 0.0000001);
    }

    @Test
    public void testGetConversion3() {
        ConvertTemperature cp = new ConvertTemperature();
        assertEquals(1.0, cp.getConversion(Constants.CELSIUS, Double.valueOf(1)), 0.0000001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetConversion4() {
        ConvertTemperature cp = new ConvertTemperature();
        cp.getConversion("Invalid", Double.valueOf(1));
    }


}