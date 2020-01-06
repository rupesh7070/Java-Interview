package patientintake;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ClinicCalendar {

   private List<PatientAppointment> appointments;
   private LocalDate today;

   public ClinicCalendar(LocalDate today) {
      this.today = today;
      this.appointments = new ArrayList<>();
   }

   public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) {
      Doctor doc = Doctor.valueOf(doctorKey.toLowerCase());
      LocalDateTime localDateTime = DateTimeConvertor.convertStringToDateTime(dateTime, today);
      PatientAppointment appointment = new PatientAppointment(patientFirstName, patientLastName,
              localDateTime, doc);
      appointments.add(appointment);

   }

   public List<PatientAppointment> getAppointments() {
      return this.appointments;
   }

   public List<PatientAppointment> getTodayAppointments() {
      return getAppointmentsForDate(today);
   }

   public List<PatientAppointment> getTomorrowAppointments() {
      LocalDate tomorrow = today.plusDays(1);
      return getAppointmentsForDate(tomorrow);
   }

   private List<PatientAppointment> getAppointmentsForDate(LocalDate tomorrow) {
      return appointments.stream()
              .filter(appt -> appt.getAppointmentDateTime().toLocalDate().equals(tomorrow))
              .collect(Collectors.toList());
   }

   public boolean hasAppointment(LocalDate date) {
      return appointments.stream().filter(a -> a.getAppointmentDateTime().toLocalDate().equals(date)).count() >1 ?true:false;



   }

}