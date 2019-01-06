package converter;

/**
 * @author Jesse Pasos
 * @name ConvertArea
 * @package Converter
 * @desc Handle temperature conversions.
 */
public class ConvertPressure {

    // VARIABLE DECLARATIONS:
    public String UNIT_DEFAULT = Constants.PA;

    public ConvertPressure() {
    }

    /**
     * @return Double VALUE 	returns the VALUE global variable.
     * @name result
     * @desc Call the conversion functions and then return the resulting value.
     */
    public Double getResult(String originalUnit, String targetUnit, Double value) {
        switch (originalUnit) {
            case Constants.PA:
                value = value * 1;
                break;
            case Constants.KPA:
                value = value * 1000;
                break;
            case Constants.MPA:
                value = value * 1000 * 1000;
                break;
            case Constants.ATM:
                value = value * 101325;
                break;
        }
        value = getConversion(targetUnit, value);
        return value;
    }
    /**
     * Pre requirement: value >= 0.0
     *
     * @name getConversion
     * @desc Convert the default value into the desired unit. This function sets the global VALUE variable.
     */
    public Double getConversion(String targetUnit, Double value) {
        switch (targetUnit) {
            case Constants.PA:
                value = value / 1.0;
                break;
            case Constants.KPA:
                value = value / 1000.0;
                break;
            case Constants.MPA:
                value = value / 1000.0 / 1000.0;
                break;
            case Constants.ATM:
                value = value / 101325.0;
                break;
            default:
                return value;
        }
        return value;
    }
}
