import { PlayingPiece } from "./PlayingPiece";

export class Player {
  public name: string;
  public piece: PlayingPiece;

  constructor(name: string, piece: PlayingPiece) {
    this.name = name;
    this.piece = piece;
  }

  setName(name: string) {
    this.name = name;
  }

  setPiece(piece: PlayingPiece) {
    this.piece = piece;
  }

  getName() {
    return this.name;
  }

  getPiece() {
    return this.piece;
  }
}
