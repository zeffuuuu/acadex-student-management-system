
public class DegreeStudent extends Student {

    // Unique attribute for degree students
    private String degreeType;

    // Parameterized constructor
    public DegreeStudent(String name, String studentId, int age,
                         String course, int semester, double cgpa,
                         int attendance, String degreeType) {

        // Call parent class constructor
        super(name, studentId, age, course, semester, cgpa, attendance);

        this.degreeType = degreeType;
    }

    // Getter
    public String getDegreeType() {
        return degreeType;
    }

    // Setter
    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    // Polymorphism: Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: Degree");
        System.out.println("Degree Type: " + degreeType);
    }
}
