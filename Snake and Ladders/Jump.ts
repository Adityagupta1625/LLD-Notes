export class Jump {
  private startPos: number;
  private endPos: number;
  constructor(startPos: number, endPos: number) {
    this.startPos = startPos;
    this.endPos = endPos;
  }

  getStartPos() {
    return this.startPos;
  }

  getEndPos() {
    return this.endPos;
  }

  setStartPos(startPos: number) {
    this.startPos = startPos;
  }

  setEndPos(endPos: number) {
    this.endPos = endPos;
  }
}
