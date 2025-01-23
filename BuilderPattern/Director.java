package BuilderPattern;

public class Director {

    private StudentBuilder student;

    public Director(StudentBuilder student) {
        this.student = student;
    }

    public Student constructStudent() {
        if (student instanceof MBAStudent) {
            return this.createMBAStudent();
        } else if (student instanceof EngineeringStudent) {
            return this.createEngineeringStudent();
        }
        return null;
    }

    public Student createMBAStudent() {
        return this.student.setName("John Doe").setAge(20).setFatherName("John Doe").setRollNumber(123).setSubjects()
                .build();
    }

    public Student createEngineeringStudent() {
        return this.student.setName("John Doe").setAge(20).setFatherName("John Doe").setRollNumber(123).setSubjects()
                .build();
    }

}
