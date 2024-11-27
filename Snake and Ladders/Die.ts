export class Die {
  private sides: number;

  constructor(sides: number = 6) {
    this.sides = sides;
  }

  setSides(sides: number) {
    this.sides = sides;
  }

  getSides() {
    return this.sides;
  }

  roll(): number {
    return Math.floor(Math.random() * this.sides) + 1;
  }
}
