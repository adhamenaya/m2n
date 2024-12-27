package RemoteFunctions;

import Observer.IM2Observer;
import Observer.M2Subject;

public class M2EmailFunction implements IM2RemoteFunction, IM2Observer {
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private String from;

    private void M2EmailFunction(String to, String subject, String body, String cc, String bcc, String from) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.cc = cc;
        this.bcc = bcc;
        this.from = from;
    }

    @Override
    public void execute(String message) {
        System.out.println("Send email function" + message);
    }

    @Override
    public void update(String message) {
        execute(message);
    }
}
