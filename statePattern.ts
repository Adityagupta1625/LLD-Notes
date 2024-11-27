// The State Pattern is a behavioral design pattern that lets an object change its behavior when its internal state changes. This pattern is a close relative of the concept of finite-state machines. The pattern allows an object to alter its behavior when its internal state changes. This can be done without changing the classes of the objects themselves.

// The State Pattern is useful when an object's behavior depends on its state, and it must change its behavior at runtime according to its state. This pattern is an alternative to approaches based on multiple conditional statements. The State Pattern is also useful when an object's behavior is defined by a complicated set of business rules.

// Problem: let us consider a document which has 3 states draft,moderation and publish depending on existing state and user actions we need to change the state of document. so there are lot of if else statements in our code. which make code messy let us say we need to add more states in future. so we need to add more if else statements in our code. code will become difficult to manage

// Solution: Here state design pattern comes into play where we create a new class for each state of object delegate the state related actions into specific state classes to transition to next state we replace the active state object with new object of other state

// Structure:

// context: reference to the concrete state object and delegate all the state related actions. it also has setter to change the new object based on new state.

// state: it is an interface which has all the state related actions.

// concrete state: provides implementation to the state interface and contains all the business logic for the state, reference to the context object fetch any required info from context. initiate state related transitions

interface State {
  publish(): void;
  edit(): void;
}

class DraftState implements State {
  publish(): void {
    console.log("draft to publish");
  }
  edit(): void {
    console.log("draft to edit");
  }
}

class ModerationState implements State {
  publish(): void {
    console.log("moderation to publish");
  }
  edit(): void {
    console.log("moderation to edit");
  }
}

class PublishedState implements State {
  publish(): void {
    console.log("published to publish");
  }
  edit(): void {
    console.log("published to edit");
  }
}

class Context {
  state: State;

  setState(state: State) {
    this.state = state;
  }

  publish() {
    this.state.publish();
  }
  edit() {
    this.state.edit();
  }
}

// main

const context = new Context();

context.setState(new DraftState());
context.publish();

context.setState(new ModerationState());
context.publish();

context.setState(new PublishedState());
context.publish();
