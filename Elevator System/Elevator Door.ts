import { ElevatorDoorState } from "./Elevator Door State";

export class ElevatorDoor {
  private state: ElevatorDoorState = ElevatorDoorState.CLOSED;

  constructor() {}

  open(): void {
    console.log("Door Open");
  }

  close(): void {
    console.log("Door Closed");
  }

  getState(): ElevatorDoorState {
    return this.state;
  }

  setState(state: ElevatorDoorState): void {
    this.state = state;
  }
}
