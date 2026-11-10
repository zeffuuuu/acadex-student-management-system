
public class DiplomaStudent extends Student {

    // Unique attribute for diploma students
    private String diplomaType;

    // Parameterized constructor
    public DiplomaStudent(String name, String studentId, int age,
                          String course, int semester, double cgpa,
                          int attendance, String diplomaType) {

        // Call the parent class constructor
        super(name, studentId, age, course, semester, cgpa, attendance);

        this.diplomaType = diplomaType;
    }

    // Getter
    public String getDiplomaType() {
        return diplomaType;
    }

    // Setter
    public void setDiplomaType(String diplomaType) {
        this.diplomaType = diplomaType;
    }

    // Polymorphism: Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: Diploma");
        System.out.println("Diploma Type: " + diplomaType);
    }
}
