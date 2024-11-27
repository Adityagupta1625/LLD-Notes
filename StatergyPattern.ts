// The Strategy Pattern, as defined by the Gang of Four, is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from the clients that use it.

// https://refactoring.guru/design-patterns/strategy

// The Strategy interface defines a method that all concrete strategies should implement.

interface Strategy {
  execute(a: number, b: number): number;
}

// different strategies
class AddStrategy implements Strategy {
  execute(a: number, b: number): number {
    return a + b;
  }
}

class SubtractStrategy implements Strategy {
  execute(a: number, b: number): number {
    return a - b;
  }
}

class MultiplyStrategy implements Strategy {
  execute(a: number, b: number): number {
    return a * b;
  }
}

// The Context defines the interface of interest to clients. It also maintains a reference to a Strategy object.

class Context {
  private strategy: Strategy;
  constructor(strategy: Strategy) {
    this.strategy = strategy;
  }

  executeStrategy(a: number, b: number): number {
    return this.strategy.execute(a, b);
  }
}

// main

const input = prompt(
  "Enter the strategy: 1 for Add, 2 for Subtract, 3 for Multiply"
);

if (input === "1") {
  const context = new Context(new AddStrategy());
  console.log(context.executeStrategy(1, 2));
} else if (input === "2") {
  const context = new Context(new SubtractStrategy());
  console.log(context.executeStrategy(1, 2));
} else {
  if (input === "3") {
    const context = new Context(new MultiplyStrategy());
    console.log(context.executeStrategy(1, 2));
  }
}

// Summary:

// Problem: Let us say we have app which has different algorithms for performing a certain operation let us say routing app which suggest best route based on vehicle mode like cycle, bus, train, car etc. Now if we want to add new algorithm we have go to main class add methods there which makes it less easy to work upon as team and prone to error as same class will get bulky and hard to maintain.

// Solution: This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from the clients that use it. So we can add different methods easily without changing the main class as well. This also follows solid principle of open closed principle.

// Structure:
// 1. Strategy Interface: Defines the common interface for all supported algorithms. Each algorithm will implement this interface.
// 2. Concrete Strategies: Implement the Strategy interface. They contain the actual algorithm logic that is interchangeable.
// 3. Context: Maintains a reference to a Strategy object. The Context is configured with a Concrete Strategy object, and it interacts with the Strategy interface to execute the algorithm.
// 4. Client: Selects the appropriate strategy and executes it using the Context. The client can change the strategy at runtime.
