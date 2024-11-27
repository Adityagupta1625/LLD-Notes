// The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undo able operations.

// Problem: Let us say we have big application where we have toolbar, menu and shortcuts now we have copy operation which we can do from toolbar, menu and shortcut. Now if we want to add new operation we have to add it in all places. It is very hard to maintain and debug. So we need to create a command pattern to solve this problem.

// Solution: Based on principle of segregation of concerns we can break app in two layers a layer for gui and layer for business logic. GUI pass the request with some request parameters to business layer. However command pattern suggest to pass request from gui to it then it will pass to the business layer command layer will handle the request and pass it to business layer. this way we can decouple gui and business layer.

// Structure:

// 1. Sender: The invoker of the command. It sends the command to the receiver. it sends the requests with all parameters to invoke this command.

// 2. Command: The command interface. It defines the interface for executing the command.

// 3. Concrete Command: Implement the Command interface. It contains the logic to execute the command.

// 4. Receiver: The receiver of the command. It receives the command and executes it.

// 5. Client: The client of the command. It creates the command and sends it to the invoker.

interface command {
  execute(): void;
}

class AirConditioner {
  temperature: number;
  isOn: boolean;

  turnOnAc() {
    this.isOn = true;
  }

  turnOffAc() {
    this.isOn = false;
  }

  setTemperature(temperature: number) {
    this.temperature = temperature;
  }
}

class TurnOnCommand implements command {
  ac: AirConditioner;

  constructor(ac: AirConditioner) {
    this.ac = ac;
  }

  execute() {
    this.ac.turnOnAc();
  }

  redo() {
    this.ac.turnOffAc();
  }
}

class TurnOffCommand implements command {
  ac: AirConditioner;

  constructor(ac: AirConditioner) {
    this.ac = ac;
  }

  execute() {
    this.ac.turnOffAc();
  }

  redo() {
    this.ac.turnOnAc();
  }
}

class RemoteControl {
  comm: command;

  setCommand(comm: command) {
    this.comm = comm;
  }

  pressButton() {
    this.comm.execute();
  }
}

// main

const ac = new AirConditioner();
const remote = new RemoteControl();

remote.setCommand(new TurnOnCommand(ac));
remote.pressButton();
