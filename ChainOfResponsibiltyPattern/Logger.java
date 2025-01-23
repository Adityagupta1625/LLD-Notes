package ChainOfResponsibiltyPattern;

public abstract class Logger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    public final Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if (nextLogger != null) {
            this.nextLogger.log(level, message);
        }
    }
}
