package ChainOfResponsibiltyPattern;

public class InfoLogger extends Logger {

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.INFO)
            System.out.println("INFO: " + message);
        else
            super.log(level, message);
    }
}
