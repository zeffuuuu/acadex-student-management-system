
public class Student {

    // 7 private attributes
    private String name;
    private String studentId;
    private int age;
    private String course;
    private int semester;
    private double cgpa;
    private int attendance;

    // Default constructor
    public Student() {
        name = "Unknown";
        studentId = "None";
        age = 0;
        course = "None";
        semester = 1;
        cgpa = 0.0;
        attendance = 0;
    }

    // Parameterized constructor
    public Student(String name, String studentId, int age,
                   String course, int semester, double cgpa,
                   int attendance) {

        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course = course;
        this.semester = semester;
        this.cgpa = cgpa;
        this.attendance = attendance;
    }
}
