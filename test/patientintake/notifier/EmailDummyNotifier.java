package patientintake.notifier;

public class EmailDummyNotifier implements EmailNotifier {
    @Override
    public void sendNotification(String subject, String body, String address) {
        System.out.println("Done sending message");

    }
}
