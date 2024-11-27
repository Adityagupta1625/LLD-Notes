import { Board } from "./Board";
import { Player } from "./Player";
import { Die } from "./Die";

class Game {
  private size: number;
  private board: Board;
  private die: Die;
  private players: Player[];

  constructor(size: number = 10) {
    this.size = size;
    this.board = new Board(size);
    this.die = new Die(6);
  }

  addPlayer(name: string) {
    this.players.push(new Player(name, 0));
  }

  play() {
    while (1) {
      const currentPlayer = this.players[0];
      this.players.shift();
      this.players.push(currentPlayer);

      console.log(currentPlayer.getName() + "'s turn");
      const roll = this.die.roll();

      console.log("Die rolled: " + roll);

      const newPosition = currentPlayer.getCurrentPosition() + roll;

      if (newPosition == this.size * this.size) {
        console.log(currentPlayer.getName() + " wins");
        break;
      } else if (newPosition > this.size * this.size) {
        continue;
      } else {
        const { x, y } = this.board.getPosition(newPosition);

        const board = this.board.getBoard();
        const jump = board[x][y].getJump();

        if (jump) {
          currentPlayer.setCurrentPosition(jump.getEndPos());
        } else currentPlayer.setCurrentPosition(newPosition);

        console.log(
          "Player " + currentPlayer.getName() + " moved to " + newPosition
        );
      }
    }
  }
}
