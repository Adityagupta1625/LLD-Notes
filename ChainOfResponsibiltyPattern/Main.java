package ChainOfResponsibiltyPattern;

public class Main {

    public static void main(String[] args) {
        Logger logger = new ErrorLogger(new DebugLogger(new InfoLogger(null)));
        logger.log(Logger.DEBUG, "Debug message");
        logger.log(Logger.INFO, "Info message");
        logger.log(Logger.ERROR, "Error message");
    }
}
