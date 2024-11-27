// The Decorator Pattern is a structural design pattern that lets you attach new behaviors to objects without modifying their implementation. It allows you to add new functionality to an existing object without modifying its external interface. The Decorator pattern is often used to add extra features to concrete components without changing their external interface.

// Problem: Let us consider a notifier library that sends notification to users. it has only email notification capability but now we want whatsapp and sms as well. we may require somewhere both email and sms somewhere whatsapp and sms so likewise we have to make lot of subclasses based on this

// Solution: we can use decorator pattern to solve this problem. we can create a decorator class that wraps the existing class and adds new functionality to it.

// Structure:

// 1. Component: This is the interface that all components and decorators must implement. It defines the interface that clients can use to interact with the component.

// 2. Concrete Component: This is the component that implements the Component interface. It has core business logic.

// 3. base decorator: This is the decorator that implements the Component interface. It delegates all the operation to the wrapped object.

// 4. concerte decorator: This is the decorator that adds new functionality to the base decorator. It wraps the base decorator and adds new functionality to it.

abstract class Pizza {
  getCost(): number {
    return 0;
  }
}

class CheesePizza extends Pizza {
  getCost(): number {
    return 100;
  }
}

class VeggiePizza extends Pizza {
  getCost(): number {
    return 200;
  }
}

abstract class ToppingsDecorator extends Pizza {
  pizza: Pizza;
  constructor(pizza: Pizza) {
    super();
    this.pizza = pizza;
  }

  getCost(): number {
    return 0;
  }
}

class CheeseTopping extends ToppingsDecorator {
  getCost(): number {
    return this.pizza.getCost() + 50;
  }
}

class VeggieTopping extends ToppingsDecorator {
  getCost(): number {
    return this.pizza.getCost() + 100;
  }
}

// client code
const pizza = new CheesePizza();

const cheeseTopping = new CheeseTopping(pizza);
console.log(cheeseTopping.getCost()); // 150

const veggieTopping = new VeggieTopping(cheeseTopping);
console.log(veggieTopping.getCost()); // 250

const veggiePizza = new CheeseTopping(new VeggieTopping(new VeggiePizza()));
