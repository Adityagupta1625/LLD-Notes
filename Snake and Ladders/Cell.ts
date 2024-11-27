import { Jump } from "./Jump";
export class Cell {
  private jump: Jump | null = null;

  setJump(jump: Jump) {
    this.jump = jump;
  }

  getJump() {
    return this.jump;
  }
}
