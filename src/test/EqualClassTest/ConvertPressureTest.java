package test.EqualClassTest;

import converter.Constants;
import converter.ConvertPressure;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.RegressionTest.modification.ModificationTestCase;

import static org.junit.Assert.assertEquals;

public class ConvertPressureTest {
    @Before
    public void setUp() {
    }

    /*
        Before modification: 9
        After modification: 16
     */
    @Test
    public void test_Valid_GetResult1() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        assertEquals(1.0, convert.getResult(Constants.PA, Constants.PA, Double.valueOf(1)), 0.0000001);
        assertEquals(1.0, convert.getResult(Constants.PA, Constants.KPA, Double.valueOf(1.0)), 0.0000001);
        assertEquals(1.0, convert.getResult(Constants.PA, Constants.MPA, Double.valueOf(1.0)), 0.0000001);
        assertEquals(1.0, convert.getResult(Constants.PA, Constants.ATM, Double.valueOf(1.0)), 0.0000001);


        assertEquals(1000.0, convert.getResult(Constants.KPA, Constants.PA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000.0, convert.getResult(Constants.KPA, Constants.KPA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000.0, convert.getResult(Constants.KPA, Constants.MPA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000.0, convert.getResult(Constants.KPA, Constants.ATM, Double.valueOf(1)), 0.0000001);

        assertEquals(1000000.0, convert.getResult(Constants.MPA, Constants.PA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000000.0, convert.getResult(Constants.MPA, Constants.KPA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000000.0, convert.getResult(Constants.MPA, Constants.MPA, Double.valueOf(1)), 0.0000001);
        assertEquals(1000000.0, convert.getResult(Constants.MPA, Constants.ATM, Double.valueOf(1)), 0.0000001);

        assertEquals(101325.0, convert.getResult(Constants.ATM, Constants.PA, Double.valueOf(1)), 0.0000001);
        assertEquals(101325.0, convert.getResult(Constants.ATM, Constants.KPA, Double.valueOf(1)), 0.0000001);
        assertEquals(101325.0, convert.getResult(Constants.ATM, Constants.MPA, Double.valueOf(1)), 0.0000001);
        assertEquals(101325.0, convert.getResult(Constants.ATM, Constants.ATM, Double.valueOf(1)), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult2() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.PA, "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult3() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.KPA, "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Valid_Exception_GetResult3_m() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.MPA, "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult4() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult(Constants.ATM, "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult5() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", "invalid", Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult6() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.PA, Double.valueOf(1));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult7() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.KPA, Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Valid_Exception_GetResult7_m() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.MPA, Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Valid_Exception_GetResult8() {
        ConvertPressure convert = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        convert.getResult("invalid", Constants.ATM, Double.valueOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult1() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult2() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult2_m() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.MPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult3() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult4() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.PA, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult5() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult6() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult6_m() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.MPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult7() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult8() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.KPA, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult_m_1() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.MPA, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult_m_2() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.MPA, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult_m_3() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.MPA, Constants.MPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult_m_4() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.MPA, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult_m_5() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.MPA, "invalid", Double.valueOf(-1.0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult9() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult10() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult10_m() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.MPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult11() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult12() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult(Constants.ATM, "invalid", Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult13() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.PA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult14() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.KPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ModificationTestCase.class)
    public void test_Invalid_GetResult14_m() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.MPA, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult15() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", Constants.ATM, Double.valueOf(-1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Invalid_GetResult16() {
        ConvertPressure cp = new ConvertPressure() {
            public Double getConversion(String targetUnit, Double value) {
                return value;
            }
        };
        cp.getResult("invalid", "invalid", Double.valueOf(-1.0));
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
    @Category(ModificationTestCase.class)
    public void testGetConversion_m() {
        ConvertPressure cp = new ConvertPressure();
        assertEquals(1.0, cp.getConversion(Constants.MPA, Double.valueOf(1000000)), 0.0000001);
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
