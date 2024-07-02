package rafi.app.sms_backEnd.error;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected StudentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
