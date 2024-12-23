package RemoteFunctions;

public class M2SendEmail implements IM2Command{
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private String from;

    public void sendEmail(String to, String subject, String body, String cc, String bcc, String from) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.cc = cc;
        this.bcc = bcc;
        this.from = from;
    }
    @Override
    public void execute() {
        // ... logic to send an email
    }
}
