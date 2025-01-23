package ChainOfResponsibiltyPattern;

public class DebugLogger extends Logger {

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.DEBUG)
            System.out.println("DEBUG: " + message);
        else
            super.log(level, message);
    }
}
