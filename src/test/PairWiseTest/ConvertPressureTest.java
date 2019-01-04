package test.PairWiseTest;

import converter.Constants;
import converter.ConvertPressure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Pair-wise test class of ConvertPressure
 */

public class ConvertPressureTest {
    @Before
    public void setUp() {
    }

    @Test
    public void test_Valid_GetResult1() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        assertEquals(1.0, convert.getResult(Constants.PA, Constants.PA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000.0, convert.getResult(Constants.KPA, Constants.KPA, Double.valueOf(1)), 0.0000001);
        assertEquals(101325.0, convert.getResult(Constants.ATM, Constants.ATM, Double.valueOf(1)), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult1() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult1() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult2() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult3() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult4() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult5() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult6() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult7() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult8() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult9() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult10() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult11() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult12() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.ATM, Double.valueOf(-1.0));
    }


    @Test
    public void testGetConversion1() {
        ConvertPressure cp = new ConvertPressure();
        assertEquals(1.0, cp.getConversion(Constants.PA, Double.valueOf(1)), 0.0000001);
    }

    @Test
    public void testGetConversion2() {
        ConvertPressure cp = new ConvertPressure();
        assertEquals(1.0, cp.getConversion(Constants.KPA, Double.valueOf(1000)), 0.0000001);
    }

    @Test
    public void testGetConversion3() {
        ConvertPressure cp = new ConvertPressure();
        assertEquals(1.0, cp.getConversion(Constants.ATM, Double.valueOf(101325.0)), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConversion4() {
        ConvertPressure cp = new ConvertPressure();
        cp.getConversion("Invalid", Double.valueOf(1));
    }
}
