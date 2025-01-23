package ChainOfResponsibiltyPattern;

public class ErrorLogger extends Logger {

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level, String message) {
        if (level == Logger.ERROR)
            System.out.println("ERROR: " + message);
        else
            super.log(level, message);
    }
}