export class Player {
  private name: string;
  private currentPosition: number;

  constructor(name: string, currentPosition: number) {
    this.name = name;
    this.currentPosition = currentPosition;
  }

  getName() {
    return this.name;
  }

  getCurrentPosition() {
    return this.currentPosition;
  }

  setCurrentPosition(currentPosition: number) {
    this.currentPosition = currentPosition;
  }
}
