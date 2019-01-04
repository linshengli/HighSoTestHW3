package converter;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class ConverterService {

    // VARIABLE DECLARATIONS:
    private static final long serialVersionUID = 1L;

    ConvertTemperature convertTemperature;

    ConvertPressure convertPressure;

    /**
     * @param result The resulting value.
     * @return String The resulting value formatted into a string.
     * @name formatResult
     * @desc Format the supplied Double variable into a string. Use the decimal formatter to round down the
     * result, set the resulting decimal places, and convert into a string type variable.
     */
    public static String formatResult(Double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        return decimalFormat.format(result);
    }

    /**
     * @param unitTarget  The desired unit.
     * @param valueSource The original value.
     * @param unitSource  The original unit.
     * @return String        A formatted String of the converted value.
     * @name convert
     * @desc Begin the conversion process. Depending on the specified conversion type value, run the appropriate
     * conversion class.
     */
    public String convert(Double valueSource, String unitSource, String unitTarget, String string_convertType) {
        switch (string_convertType) {
            // Handle TEMPERATURE conversions:
            case Constants.TEMPERATURE:
                return formatResult(convertTemperature.getResult(unitSource, unitTarget, valueSource));
            // Handle PRESSURE conversions:
            case Constants.PRESSURE:
                return formatResult(convertPressure.getResult(unitSource, unitTarget, valueSource));
            // Return "invalid" string:
            default:
                return "Invalid";
        }
    }


    public ConvertTemperature getConvertTemperature() {
        return convertTemperature;
    }

    public void setConvertTemperature(ConvertTemperature convertTemperature) {
        this.convertTemperature = convertTemperature;
    }

    public ConvertPressure getConvertPressure() {
        return convertPressure;
    }

    public void setConvertPressure(ConvertPressure convertPressure) {
        this.convertPressure = convertPressure;
    }

}
