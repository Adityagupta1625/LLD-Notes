package BuilderPattern;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private int rollNumber;
    private String fatherName;
    private List<String> subjects;

    public Student(String name, int age, int rollNumber, String fatherName, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.fatherName = fatherName;
        this.subjects = subjects;
    }

    public String toString() {
        return "" + " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }

}
