// The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that clients expect. This pattern is often used to make existing classes work with others without modifying their source code.

// Problem: let us consider a stock market application where we are getting data in csv format we want to pass data to chart library which expects data in json format. So we need to convert csv data to json format.

// Solution: We can use adapter pattern to solve this problem. We can create an adapter class that converts csv data to json format and pass it to the chart library. This adapter class will implement client interface form a wrapper around the chart service.

// Structure:

// 1. Client Interface: Defines the common interface for all supported clients. Each client will implement this interface.

// 2. Client Class: Implements the Client interface. It has core business logic.

// 3. Service Class: This is the service that we want to use. It has service related logic.

// 4. Adapter Class: This will work with both client and service. It will implement client interface. while wrapping the service class. Receives the call from client translates the call to service.

class RoundHole {
  radius: number;
  constructor(radius: number) {
    this.radius = radius;
  }

  getRadius(): number {
    return this.radius;
  }

  fits(roundPeg: RoundPeg): boolean {
    return this.radius >= roundPeg.getRadius();
  }
}

class RoundPeg {
  radius: number;
  constructor(radius: number) {
    this.radius = radius;
  }

  getRadius(): number {
    return this.radius;
  }
}

class SquarePeg {
  width: number;
  constructor(width: number) {
    this.width = width;
  }

  getWidth(): number {
    return this.width;
  }
}

class SquarePegAdapter extends RoundPeg {
  peg: SquarePeg;
  constructor(squarePeg: SquarePeg) {
    super(0);
    this.peg = squarePeg;
  }

  getRadius(): number {
    return (this.peg.getWidth() * Math.sqrt(2)) / 2;
  }
}

// Client

const hole = new RoundHole(5);

const rpeg = new RoundPeg(5);
console.log(hole.fits(rpeg)); // true

const smallSqPeg = new SquarePeg(5);
const largeSqPeg = new SquarePeg(10);

const smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
const largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

console.log(hole.fits(smallSqPegAdapter)); // true
console.log(hole.fits(largeSqPegAdapter)); // false
