import { Cell } from "./Cell";
import { Jump } from "./Jump";

export class Board {
  private board: Cell[][];
  private size: number;

  constructor(size: number = 10) {
    this.size = size;

    for (let i = 0; i < size; i++) {
      this.board[i] = new Array(size);
    }
  }

  printBoard() {
    console.table(this.board);
  }

  getPosition(pos: number) {
    return {
      x: (pos - 1) % this.size,
      y: (pos - 1) / this.size,
    };
  }

  addSnakeAndLadder(snakes: number, ladders: number) {
    while (snakes) {
      const startPos = Math.floor(Math.random() * (this.size * this.size));

      const endPos = Math.floor(Math.random() * (this.size * this.size));

      if (startPos <= endPos) {
        continue;
      }

      const snakeObj = new Jump(startPos, endPos);

      const { x, y } = this.getPosition(startPos);
      this.board[x][y].setJump(snakeObj);

      snakes--;
    }

    while (ladders) {
      const startPos = Math.floor(Math.random() * (this.size * this.size));

      const endPos = Math.floor(Math.random() * (this.size * this.size));

      if (startPos >= endPos) {
        continue;
      }

      const ladderObj = new Jump(startPos, endPos);

      const { x, y } = this.getPosition(startPos);

      this.board[x][y].setJump(ladderObj);

      ladders--;
    }
  }

  getBoard() {
    return this.board;
  }

  getBoardSize() {
    return this.size;
  }
}
