package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudent extends StudentBuilder {

    List<String> mbaSubjects;

    MBAStudent() {
        this.mbaSubjects = new ArrayList<>();
        this.mbaSubjects.add("Management");
        this.mbaSubjects.add("Economics");
        this.mbaSubjects.add("Statistics");
    }

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = mbaSubjects;
        return this;
    }
}
