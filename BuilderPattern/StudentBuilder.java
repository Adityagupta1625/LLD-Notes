package BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {

    String name;
    int age;
    int rollNumber;
    String fatherName;
    List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public abstract StudentBuilder setSubjects();

    public List<String> getSubjects() {
        return subjects;
    }

    public Student build() {
        return new Student(this.name, this.age, this.rollNumber, this.fatherName, this.subjects);
    }
}
