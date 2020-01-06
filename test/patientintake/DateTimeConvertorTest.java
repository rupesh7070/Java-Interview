package patientintake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DateTimeConvertor Class should" )
@Tag("DateTime")
class DateTimeConvertorTest {

    @Test
    @DisplayName(" Convert String to DAte Time correctly when we pass today")
    void convertStringToDateTime() {
        LocalDate localDate = LocalDate.of(2020, 1, 6);
        LocalDateTime result = DateTimeConvertor.
                convertStringToDateTime("today 1:00 am", localDate);

        assertEquals(result, LocalDateTime.of(2020, 1, 6, 1, 00),"" +
                "Test failed during parsing " +localDate);
    }

    @Test
    @DisplayName(" Convert String to date and Today is not case sentive")
    void convertStringToDateTimeCAse() {
        LocalDate localDate = LocalDate.of(2020, 1, 6);

        assertThrows(RuntimeException.class, () -> DateTimeConvertor.
                convertStringToDateTime("qToday1 1:00 am", localDate));

    }

    @Test
    @DisplayName("Convert date without today ")
    void convertStringToDateTimeWithoutToday() {
        LocalDateTime result = DateTimeConvertor.
                convertStringToDateTime("01/10/2020 1:00 pm", LocalDate.of(2020, 1, 6));

        assertEquals(result, LocalDateTime.of(2020, 1, 10, 13, 00));
    }

    @Test
    void throwException() {
        assertThrows(RuntimeException.class, () -> DateTimeConvertor.
                convertStringToDateTime("01/10/2020 13:00 PM", LocalDate.of(2020, 1, 6)));
    }

}