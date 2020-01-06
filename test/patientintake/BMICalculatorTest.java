package patientintake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BMI Calculator should....")
class BMICalculatorTest {

    @Test
    @DisplayName("Calculate correct BMI")
    void testBMI(){
        double bmi = BMICalculator.calculateBMI(20, 90);
        assertEquals(158, bmi);

    }

}