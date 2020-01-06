package patientintake;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMICalculator {


    public static Double calculateBMI(Integer inches, Integer pounds) {
       return new BigDecimal((pounds * 703) / (inches * inches)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
