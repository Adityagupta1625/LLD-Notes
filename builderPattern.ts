// The Builder Pattern is a creational design pattern that lets you construct complex objects step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

// Problem: We want to create a complex object that has a lot of properties. We want to create the object in a step by step manner. We want to be able to create the object in different ways.

// Solution: The builder pattern can be used to construct a complex object like a house. We can create a HouseBuilder class that has methods to construct the house step by step. The class can have methods to add walls, add doors, add windows, add a roof, etc. The class can then provide a method to return the constructed house. This way, the same construction process can create different representations of a house.

// Role of Director: director is responsible for creating the complex object. It is responsible for creating the object in a step by step manner. It is responsible for creating the object in different ways.Hides the complexity of creating the object from the client.

// Structure:
// 1. Builder Interface: it is implemented by all the builders it has mostly one method build this is used to make sure all builders have the same method to make construction of object smooth.

// 2. Concrete Builder: implement the Builder interface. They contain the actual logic to be executed when the object is constructed.

// 3. Director: it is responsible for creating the complex object. It is responsible for creating the object in a step by step manner. It is responsible for creating the object in different ways.

// 4. Product: it is the complex object that is constructed by the builder.

// 5. Client: The Client must associate one of the builder objects with the director. Usually, it’s done just once, via parameters of the director’s constructor. Then the director uses that builder object for all further construction. However, there’s an alternative approach for when the client passes the builder object to the production method of the director. In this case, you can use a different builder each time you produce something with the director.

class Student {
  name: string;
  age: number;
  rollNumber: number;
  fatherName: string;
  subjects: string[];

  constructor(
    name: string,
    age: number,
    rollNumber: number,
    fatherName: string,
    subjects: string[]
  ) {
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.fatherName = fatherName;
    this.subjects = subjects;
  }
}

abstract class StudentBuilder {
  name: string;
  age: number;
  rollNumber: number;
  fatherName: string;
  subjects: string[];

  setName(name: string) {
    this.name = name;
    return this;
  }

  setAge(age: number) {
    this.age = age;
    return this;
  }

  setRollNumber(rollNumber: number) {
    this.rollNumber = rollNumber;
    return this;
  }

  setFatherName(fatherName: string) {
    this.fatherName = fatherName;
    return this;
  }

  setSubjects(subjects: string[]) {
    this.subjects = subjects;
    return this;
  }

  build(): Student {
    return new Student(
      this.name,
      this.age,
      this.rollNumber,
      this.fatherName,
      this.subjects
    );
  }
}

class MBAStudentBuilder extends StudentBuilder {
  setSubjects() {
    this.subjects = [];
    this.subjects.push("Management");
    this.subjects.push("Marketing");

    return this;
  }
}

class EngineeringStudentBuilder extends StudentBuilder {
  setSubjects() {
    this.subjects = [];
    this.subjects.push("Maths");
    this.subjects.push("Physics");
    return this;
  }
}

class Director {
  student: StudentBuilder;
  constructor(student: StudentBuilder) {
    this.student = student;
  }

  createStudent() {
    if (this.student instanceof MBAStudentBuilder) {
      return this.createMBAStudent();
    } else if (this.student instanceof EngineeringStudentBuilder) {
      return this.createEngineeringStudent();
    } else {
      return null;
    }
  }

  createMBAStudent() {
    return new MBAStudentBuilder()
      .setSubjects()
      .setName("John Doe")
      .setAge(20)
      .setRollNumber(123)
      .setFatherName("John Doe")
      .build();
  }

  createEngineeringStudent() {
    return new EngineeringStudentBuilder()
      .setSubjects()
      .setName("John Doe")
      .setAge(20)
      .setRollNumber(123)
      .setFatherName("John Doe")
      .build();
  }
}

// main

const director = new Director(new MBAStudentBuilder());
const student = director.createStudent();
console.log(student);

const director2 = new Director(new EngineeringStudentBuilder());
const student2 = director2.createStudent();
console.log(student2);
