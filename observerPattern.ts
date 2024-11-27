// The Observer Pattern is a behavioral design pattern that allows an object to notify other objects about changes to its state. It defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

// Subscribers implementation
interface ISubscriber {
  update(message: string): Promise<void>;
}

class EmailSubscriber implements ISubscriber {
  async update(message: string): Promise<void> {
    console.log("Email subscriber is notified", message);
  }
}

class SmsSubscriber implements ISubscriber {
  async update(message: string): Promise<void> {
    console.log("Sms subscriber is notified", message);
  }
}

// Publisher implementation

class Publisher {
  subscribers: ISubscriber[] = [];

  addSubscriber(subscriber: ISubscriber): void {
    this.subscribers.push(subscriber);
  }

  removeSubscriber(subscriber: ISubscriber): void {
    const index = this.subscribers.indexOf(subscriber);
    if (index !== -1) {
      this.subscribers.splice(index, 1);
    }
  }

  async notifySubscribers(message: string): Promise<void> {
    for (const subscriber of this.subscribers) {
      await subscriber.update(message);
    }
  }
}

// Usage

class Orders {
  publisher: Publisher;

  constructor() {
    this.publisher = new Publisher();
  }

  orderPlaced() {
    this.publisher.notifySubscribers("New order placed");
  }

  orderUpdated() {
    this.publisher.notifySubscribers("Order updated");
  }

  orderCancelled() {
    this.publisher.notifySubscribers("Order cancelled");
  }
}

// main

const order = new Orders();

order.publisher.addSubscriber(new EmailSubscriber());
order.publisher.addSubscriber(new SmsSubscriber());

order.orderPlaced();
order.orderUpdated();

order.publisher.removeSubscriber(new SmsSubscriber());

order.orderCancelled();

// Problem: If we want to notify the customer object if there is any new model of iphone in store object ideally customer can keep coming at set interval and keep checking for the new iphone model but this will cause lot of unnecessary trips to server. so better way is to use observer pattern. to notify to customer object about new iphone model.

// Solution: This pattern has list of subscribers and notifies them on change, all its dependents are notified and updated automatically.

// Structure:
// 1. Publishers: maintains list of event subscribers and notifies them on change and has method to add or remove subscribers. notifies them on change by traversing over the list of subscribers.
// 2. Subscriber Interface: it is implemented by all the subscribers it has mostly one method update this is used to make sure all subscribers have the same method to make update by publishers smooth.
// 3. Concrete Subscribers: implement the Subscriber interface. They contain the actual logic to be executed when the event occurs.
// 4. Parameters: the parameters are passed to the subscribers when they are notified. It is used to make the logic of subscribers independent of the publisher.
// 5. Client: it creates publisher and subscribers.
