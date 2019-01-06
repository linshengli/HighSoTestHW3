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
     * @return Double VALUE 	returns the VALUE global variable.
     * @name result
     * @desc Call the conversion functions and then return the resulting value.
     */
    public Double getResult(String originalUnit, String targetUnit, Double value) {
        switch (originalUnit) {
            case Constants.FAHRENHEIT:
                value = ((value - 32.0) * 5.0) / 9.0 + 273.15;
                break;
//            case Constants.KELVIN:
//                value = value;
//                break;
            case Constants.CELSIUS:
                value = value + 273.15;
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
            // Convert KELVIN to FAHRENHEIT
            case Constants.FAHRENHEIT:
                value = (((value - 273.15) * 9) / 5) + 32;
                break;
            // Convert KELVIN to CELSIUS
            case Constants.CELSIUS:
                value = value - 273.15;
                break;
            default:
                return value;
        }
        return value;
    }
}

