package patientintake;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ClinicCalendar should....")
class ClinicCalendarTest {

    static ClinicCalendar clinicCalendar;

    @BeforeAll
    static void setUpData() {
        clinicCalendar = new ClinicCalendar(LocalDate.of(2020, 01, 06));

    }


    @Test
    @DisplayName("Allows entry of appointment")
    void allowEntryOfAnAppointment() {

        clinicCalendar.addAppointment("Jim", "Weaver", "avery",
                "09/01/2018 2:00 pm");
        List<PatientAppointment> appointments = clinicCalendar.getAppointments();
        PatientAppointment enteredAppt = appointments.get(0);
        assertAll(
                () -> assertNotNull(appointments),
                () -> assertEquals(1, appointments.size()),
                () -> assertEquals("Jim", enteredAppt.getPatientFirstName()),
                () -> assertEquals("Weaver", enteredAppt.getPatientLastName()),
                () -> assertSame(Doctor.avery, enteredAppt.getDoctor()),
                () -> assertEquals(Doctor.avery, enteredAppt.getDoctor()),
                () -> assertEquals("9/1/2018 02:00 PM",
                        enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a")))
        );
    }

    @Test
    @Disabled
    void hasAppointmentTest() {

        clinicCalendar.addAppointment("Jim", "Weaver", "avery",
                "09/01/2018 2:00 pm");
        List<PatientAppointment> appointments = clinicCalendar.getAppointments();

        LocalDate date = LocalDate.parse("09/01/2018 2:00 pm".toUpperCase(),
                DateTimeFormatter.ofPattern("M/d/yyyy h:mm a", Locale.US));
        assertTrue(clinicCalendar.hasAppointment(date));


    }

    @Test
    void hasNoAppointmentTest() {

        LocalDate date = LocalDate.parse("09/01/2018 2:00 pm".toUpperCase(),
                DateTimeFormatter.ofPattern("M/d/yyyy h:mm a", Locale.US));
        assertFalse(clinicCalendar.hasAppointment(date));
    }

    @Test
    @DisplayName("Display future appointment")
    void shouldDisplayFutureAppointment(){

        clinicCalendar.addAppointment("Jim", "Weaver", "avery",
                "09/01/2022 2:00 pm");

        assertNotNull(clinicCalendar.displayFutureAppointment());
    }



}