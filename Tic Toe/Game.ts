import { Board } from "./Models/Board";
import { Player } from "./Models/Player";
import { PlayingPieceO } from "./Models/PlayingPieceO";
import { PlayingPieceX } from "./Models/PlayingPieceX";

export class Game {
  public board: Board;
  public player1: Player;
  public player2: Player;
  constructor() {
    this.board = new Board();
    const pieceX = new PlayingPieceX();
    const pieceO = new PlayingPieceO();
    this.player1 = new Player("Player 1", pieceX);
    this.player2 = new Player("Player 2", pieceO);
  }

  play() {
    const currentPlayer: Player[] = [];
    currentPlayer.push(this.player1, this.player2);

    while (1) {
      this.board.printBoard();

      if (!this.board.isFree()) {
        break;
      }

      const player = currentPlayer[0];

      currentPlayer.shift();
      currentPlayer.push(player);
      console.log(player.getName() + "'s turn");

      const row = parseInt(prompt("Enter row: ") as string);
      const col = parseInt(prompt("Enter col: ") as string);

      if (this.board.checkFree(row, col)) {
        this.board.placePiece(row, col, player.getPiece().piece);
        if (this.board.checkWinner(player.getPiece().piece)) {
          this.board.printBoard();
          console.log(player.getName() + " wins!");
          break;
        }
      } else {
        console.log("Invalid move");
        continue;
      }
    }
  }
}
