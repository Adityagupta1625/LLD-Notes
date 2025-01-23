package BuilderPattern;

public class Main {

    public static void main(String[] args) {

        Director director1 = new Director(new MBAStudent());
        Student student1 = director1.constructStudent();

        Director director2 = new Director(new EngineeringStudent());
        Student student2 = director2.constructStudent();

        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
