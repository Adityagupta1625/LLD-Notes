export class Board {
  public board: string[][];

  constructor() {
    this.board = new Array(3);
    for (let i = 0; i < 3; i++) {
      this.board[i] = new Array(3);
      for (let j = 0; j < 3; j++) {
        this.board[i][j] = "-";
      }
    }
  }

  placePiece(row: number, col: number, piece: string) {
    this.board[row][col] = piece;
  }

  getPiece(row: number, col: number) {
    return this.board[row][col];
  }

  printBoard() {
    console.table(this.board);
  }

  checkFree(row: number, col: number) {
    return this.board[row][col] === "-";
  }

  checkWinner(piece: string) {
    let val: string[] = [];

    for (let i = 0; i < 3; i++) val.push(piece);

    for (let i = 0; i < 3; i++) {
      let temp: string[] = [];
      for (let j = 0; j < 3; j++) temp.push(this.board[i][j]);
      if (temp === val) return true;
    }

    for (let i = 0; i < 3; i++) {
      let temp: string[] = [];
      for (let j = 0; j < 3; j++) temp.push(this.board[j][i]);
      if (temp === val) return true;
    }

    if (
      this.board[0][0] === piece &&
      this.board[1][1] === piece &&
      this.board[2][2] === piece
    )
      return true;

    if (
      this.board[0][2] === piece &&
      this.board[1][1] === piece &&
      this.board[2][0] === piece
    )
      return true;
  }

  isFree() {
    for (let i = 0; i < 3; i++) {
      for (let j = 0; j < 3; j++) {
        if (this.board[i][j] === "-") return true;
      }
    }
    return false;
  }
}
