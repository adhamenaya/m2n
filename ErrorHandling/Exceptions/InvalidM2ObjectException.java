package ErrorHandling.Exceptions;

public class InvalidM2ObjectException extends Exception {
    public InvalidM2ObjectException() {
        super("Invalid M2Object Exception, Please check validFrom amd validTo fields.");
    }

    public InvalidM2ObjectException(Throwable cause) {
        super("Invalid M2Object Exception, Please check validFrom amd validTo fields.", cause);
    }
}
