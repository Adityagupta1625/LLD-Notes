package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentBuilder {
    List<String> engineeringSubjects;

    EngineeringStudent() {
        this.engineeringSubjects = new ArrayList<>();
        this.engineeringSubjects.add("Computer Science");
        this.engineeringSubjects.add("Data Structures");
        this.engineeringSubjects.add("Operating Systems");
    }

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = engineeringSubjects;
        return this;
    }
}
