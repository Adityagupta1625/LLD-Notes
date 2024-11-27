// Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

abstract class Logger {
  private nextLogger: Logger | null = null;

  public static INFO: number = 1;
  public static DEBUG: number = 2;
  public static ERROR: number = 3;

  constructor(nextLogger: Logger | null) {
    this.nextLogger = nextLogger;
  }

  public log(level: number, message: string): void {
    if (this.nextLogger !== null) {
      this.nextLogger.log(level, message);
    }
  }
}

class InfoLogger extends Logger {
  public log(level: number, message: string): void {
    if (level === Logger.INFO) {
      console.log(`INFO: ${message}`);
    } else {
      super.log(level, message);
    }
  }
}

class DebugLogger extends Logger {
  public log(level: number, message: string): void {
    if (level === Logger.DEBUG) {
      console.log(`DEBUG: ${message}`);
    } else {
      super.log(level, message);
    }
  }
}

class ErrorLogger extends Logger {
  public log(level: number, message: string): void {
    if (level === Logger.ERROR) {
      console.log(`ERROR: ${message}`);
    } else {
      super.log(level, message);
    }
  }
}

// Client

const logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

logger.log(Logger.INFO, "Hello World");
logger.log(Logger.DEBUG, "Hello World");
logger.log(Logger.ERROR, "Hello World");

// Problem: Consider a system where we are getting request from client we want to first authenticate the request then check whether that user is authorized for that operation or not then finally execute the operation.But know we want to add some request validation and then a new algo to prevent password breakages later on may be caching as well to speed up the response. Changing in single class is not good. It will be hard to maintain and debug. So we need to create a chain of responsibility pattern to solve this problem.

// Solution: In chain of responsibility each handler is defined independently and linked to each other like a chain. In addition to processing request each handler move request to next handler in chain if it is not null.

// Structure:
// 1. Handler Interface: Defines the common interface for all supported handlers. Each handler will implement this interface.
// 2. Base Handlers: Implement the Handler interface. They contain the boilerplate logic to be common to all handlers.
// 3. Concrete Handlers: Implement the Handler interface. They contain the actual logic to be executed when the request is handled.
// 4. Client: The Client may compose chains just once or compose them dynamically, depending on the application’s logic.
