package converter;

/**
 * @author Jesse Pasos
 * @name ConvertTemperature
 * @package Converter
 * @desc Handle temperature conversions.
 */
public class ConvertTemperature {

    // VARIABLE DECLARATIONS:
    public String UNIT_DEFAULT = Constants.CELSIUS;


    public ConvertTemperature() {
    }


    /**
     * @name result
     * @desc Call the conversion functions and then return the resulting value.
     * @return Double VALUE 	returns the VALUE global variable.
     */
    public Double getResult(String originalUnit, String targetUnit, Double value) {
        switch (originalUnit) {
            case Constants.FAHRENHEIT:
                value = ((value - 32) * 5) / 9;
                break;
            case Constants.KELVIN:
                value = value - 273.15;
                break;
            default:
                break;
        }
        value = getConversion(targetUnit, value);    // Convert the default value into the desired unit.
        return value;
    }


    /**
     * @name getConversion
     * @desc Convert the default value into the desired unit. This function sets the global VALUE variable.
     */
    public Double getConversion(String targetUnit, Double value) {

        switch (targetUnit) {
            // Convert CALCIUS to FAHRENHEIT
            case Constants.FAHRENHEIT:
                value = ((value * 9) / 5) + 32;
                break;
            // Convert CALCIUS to KALVIN
            case Constants.KELVIN:
                value = value + 273.15;
                break;
            default:
                return value;
        }
        return value;
    }
}

