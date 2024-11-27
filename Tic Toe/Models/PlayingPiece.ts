export enum PieceType {
  X = "X",
  O = "O",
}

export class PlayingPiece {
  public piece: PieceType;

  constructor(piece: PieceType) {
    this.piece = piece;
  }
}
